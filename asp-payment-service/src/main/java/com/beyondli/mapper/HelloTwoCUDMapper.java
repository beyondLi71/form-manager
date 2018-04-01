package com.beyondli.mapper;

import com.beyondli.mapper.entity.UserTwoEntity;
import org.apache.ibatis.annotations.Insert;

/**
 * Created by beyondLi
 * Date 2018/4/1 16:50
 * Desc .
 */
public interface HelloTwoCUDMapper {
    @Insert("INSERT INTO payment (name, age) VALUES (#{name}, #{age})")
    void addUser(UserTwoEntity userTwoEntity);
}
