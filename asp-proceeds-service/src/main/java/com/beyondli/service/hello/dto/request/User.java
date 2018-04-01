package com.beyondli.service.hello.dto.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.NotBlank;

import javax.validation.constraints.NotNull;

/**
 * Created by beyondLi
 * Date 2018/4/1 4:55
 * Desc .
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    @NotBlank(message = "PROC_HELL_0001")
    private String name;
    @NotNull(message = "PROC_HELL_0002")
    private Integer age;
}
