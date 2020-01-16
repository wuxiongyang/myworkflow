package com.example.workflow.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/DataController")
public class DataController {
    @RequestMapping("/getTreeData")
    @ResponseBody
    public JSONArray getTreeData(String code){
        JSONArray jsonArray=new JSONArray();
        if("food".equals(code)){
            JSONObject object2=new JSONObject();
            object2.put("id",2);
            object2.put("text","食物");
            JSONArray foodChildren=new JSONArray();
            JSONObject foodChildren1=new JSONObject();
            foodChildren1.put("id",21);
            foodChildren1.put("text","牛奶");
            JSONObject foodChildren2=new JSONObject();
            foodChildren2.put("id",22);
            foodChildren2.put("text","面包");
            foodChildren.add(foodChildren1);
            foodChildren.add(foodChildren2);
            object2.put("children",foodChildren);
            jsonArray.add(object2);
        }else if("hobby".equals(code)){
            JSONObject object3=new JSONObject();
            object3.put("id",3);
            object3.put("text","爱好");
            JSONArray hobbyChildren=new JSONArray();
            JSONObject hobbyChildren1=new JSONObject();
            hobbyChildren1.put("id",31);
            hobbyChildren1.put("text","打篮球");
            JSONObject hobbyChildren2=new JSONObject();
            hobbyChildren2.put("id",32);
            hobbyChildren2.put("text","唱歌");
            JSONObject hobbyChildren3=new JSONObject();
            hobbyChildren3.put("id",33);
            hobbyChildren3.put("text","RAP");
            hobbyChildren.add(hobbyChildren1);
            hobbyChildren.add(hobbyChildren2);
            hobbyChildren.add(hobbyChildren3);
            object3.put("children",hobbyChildren);
            jsonArray.add(object3);
        }else if("lang".equals(code)){
            JSONObject object=new JSONObject();
            object.put("id",1);
            object.put("text","语言");
            JSONArray children=new JSONArray();
            JSONObject children1=new JSONObject();
            children1.put("id",11);
            children1.put("text","Java");
            JSONObject children2=new JSONObject();
            children2.put("id",12);
            children2.put("text","C++");
            JSONObject children3=new JSONObject();
            children3.put("id",13);
            children3.put("text","python1");
            JSONObject children4=new JSONObject();
            children4.put("id",14);
            children4.put("text","python2");
            JSONObject children5=new JSONObject();
            children5.put("id",15);
            children5.put("text","python3");
            JSONObject children6=new JSONObject();
            children6.put("id",16);
            children6.put("text","python4");
            JSONObject children7=new JSONObject();
            children7.put("id",17);
            children7.put("text","python5");
            JSONObject children8=new JSONObject();
            children8.put("id",18);
            children8.put("text","python6");
            JSONObject children9=new JSONObject();
            children9.put("id",19);
            children9.put("text","python7");
            JSONObject children10=new JSONObject();
            children10.put("id",111);
            children10.put("text","python8");
            children.add(children1);
            children.add(children2);
            children.add(children3);
            children.add(children4);
            children.add(children5);
            children.add(children6);
            children.add(children7);
            children.add(children8);
            children.add(children9);
            children.add(children10);
            object.put("children",children);
            jsonArray.add(object);
        }
        return jsonArray;
    }

    @RequestMapping("/getMainTreeData")
    @ResponseBody
    public JSONArray getMainTreeData(){
        JSONArray jsonArray=new JSONArray();
        JSONObject root=new JSONObject();
        root.put("id",0);
        root.put("text","全部");

        JSONObject object=new JSONObject();
        object.put("id","lang");
        object.put("text","语言");


        JSONObject object2=new JSONObject();
        object2.put("id","food");
        object2.put("text","食物");


        JSONObject object3=new JSONObject();
        object3.put("id","hobby");
        object3.put("text","爱好");

        JSONArray rootchildren=new JSONArray();
        rootchildren.add(object3);
        rootchildren.add(object2);
        rootchildren.add(object);
        root.put("children",rootchildren);
        jsonArray.add(root);
        return jsonArray;
    }
}
