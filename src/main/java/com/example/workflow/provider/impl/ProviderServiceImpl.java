package com.example.workflow.provider.impl;


import com.example.workflow.provider.ProviderService;



public class ProviderServiceImpl implements ProviderService {
    @Override
    public String sayHello(String name) {
        return "Hello "+name;
    }
}
