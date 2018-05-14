package com.beyondli.service.hello;


import com.beyondli.service.hello.dto.request.User;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;

/**
 * Created by beyondLi
 * Date 2018/4/1 4:32
 * Desc .
 */
@Validated
public interface HelloService {
    /**
     * 新增用户
     * @param user
     */
    void addUser(@Valid User user);
}
