package com.example.workflow.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/pageController")
public class pageController {
    @RequestMapping("/pageTest")
    public String test(){
        return "index";
    }


    @RequestMapping("/toMain")
    public String toMain(){
        return "main";
    }
}
