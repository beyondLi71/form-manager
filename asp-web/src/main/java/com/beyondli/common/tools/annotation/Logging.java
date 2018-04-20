package com.beyondli.common.tools.annotation;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.lang.annotation.Annotation;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by beyondLi
 * Date 2018/4/16 13:37
 * Desc .
 */
@Aspect
@Component
public class Logging {

    @Pointcut("@annotation(com.beyondli.common.tools.annotation.MyLogAnnotation)")
    private void cut(){}

    @Before("cut()")
    public void BeforeCall()
    {
        System.out.println("事前通知");
    }



    @Around("cut()")
    public void AroundCall(ProceedingJoinPoint point)
    {
        System.out.println("环绕通知之开始");
        //获取方法
        MethodSignature signature = (MethodSignature) point.getSignature();
        //访问路径
        List<Annotation> annotations = Arrays.asList(signature.getMethod().getDeclaredAnnotations())
                .stream()
                .filter(annotation -> annotation.annotationType() == RequestMapping.class)
                .collect(Collectors.toList());
        String requestPath = annotations.size() >= 1
                ? signature.getMethod().getAnnotation(RequestMapping.class).value()[0] : "";
        String className = point.getSignature().getDeclaringType().getSimpleName();
        String methodName = point.getSignature().getName();
        String args = getArgs(point);
        //请求路径，类名，方法名，参数列表
        /*log.log(Level.INFO, "\n---------请求路径: " + requestPath
                + "\n---------类名: " + className
                + "\n---------方法: " + methodName
                + "\n---------参数: {" + getArgs(point) + "}");*/
        try {
            point.proceed();
        } catch (Throwable e) {
            e.printStackTrace();
        }
        System.out.println("环绕通知之结束");
    }

    @After("cut()")
    public void AfterCall()
    {
        System.out.println("事后通知");
    }

    private String getArgs(JoinPoint point) {
        String[] parameterNames = ((MethodSignature) point.getSignature()).getParameterNames();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < parameterNames.length; i++) {
            sb.append(parameterNames[i] + ":" + point.getArgs()[i].toString() + "; ");
        }

        return sb.toString();
    }
}
