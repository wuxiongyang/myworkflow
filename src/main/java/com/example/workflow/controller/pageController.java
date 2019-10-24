package com.example.workflow.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class pageController {
    @RequestMapping("/pageTest")
    public String test(){
        return "index";
    }
}
