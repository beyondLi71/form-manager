package com.beyondli.controller;

import com.beyondli.common.utils.apiresult.AbstractApiResult;
import com.beyondli.service.hello.HelloService;
import com.beyondli.service.hello.dto.request.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * Created by beyondLi
 * Date 2018/4/1 1:49
 * Desc .
 */
@RestController
@Api(value = "asp")
@RequestMapping(value = "/hello")
public class HelloController {
    @Resource
    HelloService helloService;

    /**
     * 测试异常
     * @param state
     * @return
     */
    @RequestMapping(value = "/get/info/{state}", method = RequestMethod.GET)
    public String getInfo(@PathVariable String state) {
        return "asp success";
    }

    /**
     * 测试校验
     */
    @ApiOperation(value = "测试校验", notes = "通过state测试校验")
    @RequestMapping(value = "/test/val/{state}", method = RequestMethod.GET)
    public String testVal(@PathVariable String state) {
        return "asp success";
    }

    /**
     * 新增用户
     */
    @RequestMapping(value = "/add/user", method = RequestMethod.POST)
    public AbstractApiResult addUser(@RequestBody User user) {
        helloService.addUser(user);
        return AbstractApiResult.success("success");
    }
}
