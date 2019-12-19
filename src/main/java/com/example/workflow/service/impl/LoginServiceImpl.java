package com.example.workflow.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.example.workflow.CommonClass.OutData;
import com.example.workflow.entity.User;
import com.example.workflow.mapper.UserMapper;
import com.example.workflow.service.LoginService;
import com.example.workflow.util.Constant;
import com.example.workflow.vo.UserVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Component
public class LoginServiceImpl implements LoginService {
    //注入redis
    @Autowired
    private RedisTemplate<String,String> redisTemplate;
    @Autowired
    private UserMapper userMapper;
    /**
     * 登陆
     */
    @Override
    public OutData login(UserVo userVo) {
        OutData result=new OutData();
        User user=new User();
        user.setUserName(userVo.getUserName());
        int i = userMapper.selectCount(user);
        if(Constant.ZERO==i){
            result.setCode(1);
            result.setMsg("账户名不存在");
        }else {
            user.setPassWord(userVo.getPassWord());
            List<User> userList = userMapper.select(user);
            if(Constant.ZERO==userList.size()){
                result.setCode(1);
                result.setMsg("密码不正确");
            }
        }
        return result;
    }


}
