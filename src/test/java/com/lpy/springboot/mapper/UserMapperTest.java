package com.lpy.springboot.mapper;

import com.lpy.springboot.service.UserService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class UserMapperTest {

    @Autowired
    UserService userService;

    @Test
    public void findAllUser() {

        System.out.println("userService = " + userService);

        userService.findAllUser();

    }


}