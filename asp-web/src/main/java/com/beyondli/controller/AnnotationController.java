package com.beyondli.controller;

import com.beyondli.common.tools.annotation.MyLogAnnotation;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * Created by beyondLi
 * Date 2018/4/1 1:49
 * Desc .
 */
@RestController
@Api(value = "asp")
@RequestMapping(value = "/extend")
public class AnnotationController {

    /**
     * 自定义注解测试
     * @return
     */
    @RequestMapping(value = "/test/annotation", method = RequestMethod.GET)
    @MyLogAnnotation
    public String testAnnotation() {
        System.out.println("啦啦啦");
        return "success";
    }
}
