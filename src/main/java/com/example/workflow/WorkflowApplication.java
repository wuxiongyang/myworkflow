package com.example.workflow;


import org.activiti.spring.boot.SecurityAutoConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import tk.mybatis.spring.annotation.MapperScan;


@MapperScan("com.example.workflow.mapper")//mybatis接口扫描
@EnableCaching
@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
public class WorkflowApplication {
    public static void main(String[] args) {
        SpringApplication.run(WorkflowApplication.class, args);
    }

}
