package com.hdf.oasys;

import com.hdf.oasys.entity.User;
import com.hdf.oasys.mapper.UserMapper;
import org.apache.ibatis.annotations.Mapper;
import org.junit.jupiter.api.Test;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Configuration;

@SpringBootTest
class OaSysApplicationTests {
    @Autowired
    private UserMapper userMapper;
    @Test
    void contextLoads() {
        User user = userMapper.findAll(5);
        System.out.println(user);
        userMapper.insert(new User(8,"小中","123123","男",1));
        user = userMapper.findAll(7);
        System.out.println(user);
    }

}
