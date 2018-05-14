package com.beyondli.service.hellotwo.impl;

import com.beyondli.common.utils.mapper.MapperUtils;
import com.beyondli.mapper.HelloTwoCUDMapper;
import com.beyondli.mapper.entity.UserTwoEntity;
import com.beyondli.service.hellotwo.HelloTwoService;
import com.beyondli.service.hellotwo.dto.request.UserTwo;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by beyondLi
 * Date 2018/4/1 16:49
 * Desc .
 */
@Service
public class HelloTwoServiceImpl implements HelloTwoService {
    @Resource
    HelloTwoCUDMapper helloTwoCUDMapper;

    /**
     * 添加用户
     * @param user
     */
    @Override
    @Transactional(rollbackFor = Exception.class)
    public void addUser(UserTwo user) {
        UserTwoEntity userTwoEntity = MapperUtils.mapperBean(user, UserTwoEntity.class);
        helloTwoCUDMapper.addUser(userTwoEntity);
    }
}
