package com.lpy.springboot.controller;

import com.lpy.springboot.model.User;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {



    @RequestMapping("/listUser")
    public String listUser(Model model) {

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
