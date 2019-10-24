package com.example.workflow.controller;

import com.example.workflow.service.ActivityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/activity")
public class ActivityController {
    @Autowired
    ActivityService activityService;
    @RequestMapping("/testActivity")
    public void testActivity() {

    }
}
