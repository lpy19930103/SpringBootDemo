package com.lpy.springboot.service.impl;

import com.lpy.springboot.mapper.UserMapper;
import com.lpy.springboot.model.User;
import com.lpy.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> findAllUser() {
        System.out.println("userMapper = " + userMapper);
        return userMapper.findAllUser();
    }
}
