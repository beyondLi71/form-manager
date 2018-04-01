package com.beyondli.common.config;

import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * @Author beyondLi
 */
@PropertySource(value = "examine-exception.properties", encoding = "UTF-8")
@Component
public class ExamineLoadExceptionProperties {

}
