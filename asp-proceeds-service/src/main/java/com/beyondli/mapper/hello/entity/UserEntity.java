package com.beyondli.mapper.hello.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.NotBlank;

import javax.validation.constraints.NotNull;

/**
 * Created by beyondLi
 * Date 2018/4/1 5:10
 * Desc .
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserEntity {
    //姓名
    private String name;
    //年龄
    private Integer age;
}
