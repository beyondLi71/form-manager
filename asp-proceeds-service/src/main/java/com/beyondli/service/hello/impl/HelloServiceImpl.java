package com.beyondli.service.hello.impl;

import com.beyondli.common.utils.exception.ExceptionManager;
import com.beyondli.common.utils.mapper.MapperUtils;
import com.beyondli.mapper.hello.HelloCUDMapper;
import com.beyondli.mapper.hello.entity.UserEntity;
import com.beyondli.service.hello.HelloService;
import com.beyondli.service.hello.dto.request.User;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.annotation.Validated;

import javax.annotation.Resource;

/**
 * Created by beyondLi
 * Date 2018/4/1 4:33
 * Desc .
 */
@Service
public class HelloServiceImpl implements HelloService {
    @Resource
    HelloCUDMapper helloCUDMapper;
    @Resource
    ExceptionManager exceptionManager;
    /**
     * 添加用户
     * @param user
     */
    @Override
    @Transactional(rollbackFor = Exception.class)
    public void addUser(User user) {
        UserEntity userEntity = MapperUtils.mapperBean(user, UserEntity.class);
        userEntity.setId(1);
        helloCUDMapper.addUser(userEntity);
    }
}
