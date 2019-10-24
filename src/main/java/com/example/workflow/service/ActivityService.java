package com.example.workflow.service;

import org.activiti.engine.ProcessEngine;
import org.activiti.engine.ProcessEngineConfiguration;
import org.activiti.engine.ProcessEngines;
import org.activiti.engine.repository.Deployment;
import org.activiti.engine.runtime.ProcessInstance;
import org.springframework.stereotype.Service;

@Service
public class ActivityService {

    public void testActivity(){


               //创建茂盛的头发
               Hair luxuriant_hair=new Luxuriant_hair();
               //创建女朋友们
               Object girlFriends=new GirlFriends();



     System.out.println(luxuriant_hair.toString()+girlFriends);

        startProcessInstance();
       // completeMyPersonalTask();
        //createTable();
    }

    public void startProcessInstance(){

        //流程定义的key
        ProcessEngine processEngine = ProcessEngines.getDefaultProcessEngine();
        String processDefinitionKey ="myProcess_1";

        ProcessInstance pi = processEngine.getRuntimeService()//与正在执行   的流程实例和执行对象相关的Service

                .startProcessInstanceByKey(processDefinitionKey);  //使用流程定义的key启动流程实例,key对应helloworld.bpmn文件中id的属性值，使用key值启动，默认是按照最新版本的流程定义启动

        System.out.println("流程实例ID:"+pi.getId());

        System.out.println("流程定义ID:"+pi.getProcessDefinitionId());

    }
    public void createTable() {
        ProcessEngineConfiguration processEngineConfiguration = ProcessEngineConfiguration
                .createStandaloneProcessEngineConfiguration();
        // 连接数据库的配置
        processEngineConfiguration.setJdbcDriver("com.mysql.jdbc.Driver");
        processEngineConfiguration
                .setJdbcUrl("jdbc:mysql://localhost:3306/workflow?useUnicode=true&characterEncoding=utf8&serverTimezone=UTC");
        processEngineConfiguration.setJdbcUsername("root");
        processEngineConfiguration.setJdbcPassword("root");

        /**
         * public static final String DB_SCHEMA_UPDATE_FALSE = "false";不能自动创建表，需要表存在
         * public static final String DB_SCHEMA_UPDATE_CREATE_DROP =
         * "create-drop";先删除表再创建表 public static final String DB_SCHEMA_UPDATE_TRUE =
         * "true";如果表不存在，自动创建表
         */
        processEngineConfiguration.setDatabaseSchemaUpdate(ProcessEngineConfiguration.DB_SCHEMA_UPDATE_TRUE);
        // 工作流的核心对象，ProcessEnginee对象
        ProcessEngine processEngine = processEngineConfiguration.buildProcessEngine();
        System.out.println("processEngine:" + processEngine);
    }
    public void completeMyPersonalTask(){
        ProcessEngine processEngine = ProcessEngines.getDefaultProcessEngine();
        //任务ID

        String taskId = "2505";

        processEngine.getTaskService()//与正在执行的任务管理相关的Service

                .complete(taskId);

        System.out.println("完成任务：任务ID:"+taskId);

    }


     class Hair{

    }
    class Luxuriant_hair extends Hair{

    }
    class Keyboard{

    }
    class Mechanical_keyboard extends Keyboard{

    }
    class GirlFriends extends Object{

    }
}
