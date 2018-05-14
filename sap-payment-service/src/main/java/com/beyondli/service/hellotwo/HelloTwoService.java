package com.beyondli.service.hellotwo;

import com.beyondli.service.hellotwo.dto.request.UserTwo;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;

/**
 * Created by beyondLi
 * Date 2018/4/1 16:49
 * Desc .
 */
@Validated
public interface HelloTwoService {
    /**
     * 新增用户
     * @param userTwo
     */
    void addUser(@Valid UserTwo userTwo);
}
