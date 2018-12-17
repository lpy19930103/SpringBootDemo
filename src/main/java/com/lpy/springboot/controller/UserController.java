package com.lpy.springboot.controller;

import com.lpy.springboot.model.User;
import com.lpy.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class UserController {
    @Autowired
    private UserService userService;


    @RequestMapping("/listUser")
    public String listUser(Model model) {
        model.addAttribute("listUser", userService.findAllUser());
        return "listUser";
    }

    @RequestMapping(value = "/regist", method = {RequestMethod.POST})
    public User regist(@RequestParam String userName) {
        User user = new User();
        user.setUsername(userName);
        user.setPassword("1234");
        return user;
    }
}
