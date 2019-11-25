package com.example.workflow.controller;

import com.alibaba.fastjson.JSONObject;
import com.example.workflow.service.LoginService;
import com.example.workflow.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/testBoot")
public class UserController {
    @Autowired
    private UserService userService;

    @Autowired
    private LoginService loginService;

    @RequestMapping("getUser/{id}")
    public String GetUser(@PathVariable int id) {
        return null;
    }

    @RequestMapping("stress_test")
    public String GetAllUsers() {

        return loginService.stress_test().toString();
    }

}
