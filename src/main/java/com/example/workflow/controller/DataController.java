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
    public JSONArray getTreeData(){
        JSONArray jsonArray=new JSONArray();
        JSONObject object=new JSONObject();
        object.put("id",1);
        object.put("text","Languages");
        JSONArray children=new JSONArray();
        JSONObject children1=new JSONObject();
        children1.put("id",11);
        children1.put("text","Java");
        JSONObject children2=new JSONObject();
        children2.put("id",12);
        children2.put("text","C++");
        JSONObject children3=new JSONObject();
        children3.put("id",13);
        children3.put("text","python");
        children.add(children1);
        children.add(children2);
        children.add(children3);
        object.put("children",children);
        jsonArray.add(object);
        return jsonArray;
    }
}
