package com.beyondli.common.tools.annotation;

import java.lang.annotation.*;

/**
 * Created by beyondLi
 * Date 2018/4/16 13:18
 * Desc .
 */
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface MyLogAnnotation {
    String desc() default "Hi beyondLi";
}