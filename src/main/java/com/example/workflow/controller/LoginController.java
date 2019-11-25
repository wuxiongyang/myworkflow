package com.example.workflow.controller;

import com.alibaba.fastjson.JSONObject;
import com.example.workflow.service.LoginService;
import com.example.workflow.vo.UserVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LoginController {
    @Autowired
    private LoginService loginService;
    @RequestMapping("/login")
    @ResponseBody
    public JSONObject login(UserVo userVo){

        return loginService.login(userVo);
    }
}
