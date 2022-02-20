package com.hdf.oasys.controller;

import com.hdf.oasys.entity.User;
import com.hdf.oasys.mapper.UserMapper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import java.util.Map;

@Controller
@RequestMapping(value = "user/login", method = RequestMethod.POST)
public class LoginController {

    @Resource
    private UserMapper userMapper;

    public String login(@RequestParam("loginName") String loginName,
                        @RequestParam("password") String password, Map<String,Object> map) {
        User user =  userMapper.findByLoginName(loginName);
        if (loginName.equals(user.getLoginName()) && password.equals(user.getPassword())) {
            return "登录成功";
        } else {
            return "登失败";
        }
    }
}
