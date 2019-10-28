package com.example.workflow.consumer;

import com.alibaba.dubbo.config.annotation.Reference;
import com.example.workflow.provider.ProviderService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Consumer {
    // 使用兼容注入，可以使用dubbo原生注解@Reference注入
//    @Reference
//    public ProviderService service;
//
//    @GetMapping(value = "/hello/{name}")
//    public String hello(@PathVariable String name){
//        return service.sayHello(name);
//    }
}