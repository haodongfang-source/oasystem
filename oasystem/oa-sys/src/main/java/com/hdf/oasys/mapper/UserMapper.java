package com.hdf.oasys.mapper;

import com.hdf.oasys.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
    User findAll(Integer id);
    int insert(User user);
    User findByLoginName(String loginName);
}
