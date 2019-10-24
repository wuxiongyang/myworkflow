package com.example.workflow.service;

import com.example.workflow.entity.User;
import com.example.workflow.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

@Service
public class UserService  {
    @Autowired
    UserMapper userMapper;

    public User Sel(int id){
        return userMapper.Sel(id);
    }

    public List<User> getAll(){
        List<User> users = userMapper.selectAll();
        return users;
    }
}
