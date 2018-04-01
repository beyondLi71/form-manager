package com.beyondli.mapper.hello;

import com.beyondli.mapper.hello.entity.UserEntity;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

/**
 * Created by beyondLi
 * Date 2018/4/1 4:31
 * Desc .
 */
public interface HelloCUDMapper {
    @Insert("INSERT INTO user (name, age) VALUES (#{name}, #{age})")
    void addUser(UserEntity userEntity);
}
