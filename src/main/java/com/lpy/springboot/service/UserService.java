package com.lpy.springboot.service;

import com.lpy.springboot.model.User;
import org.springframework.stereotype.Service;

import java.util.List;

public interface UserService {
    List<User> findAllUser();
}
