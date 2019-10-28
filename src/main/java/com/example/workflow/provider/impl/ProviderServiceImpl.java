package com.example.workflow.provider.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.example.workflow.provider.ProviderService;
import org.springframework.stereotype.Component;

@Service
public class ProviderServiceImpl implements ProviderService {
    @Override
    public String sayHello(String name) {
        return "Hello "+name;
    }
}
