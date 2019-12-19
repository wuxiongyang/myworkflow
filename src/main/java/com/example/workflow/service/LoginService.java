package com.example.workflow.service;

import com.alibaba.fastjson.JSONObject;
import com.example.workflow.CommonClass.OutData;
import com.example.workflow.vo.UserVo;
import org.springframework.stereotype.Service;

@Service
public interface LoginService {
    /**
     * 登陆
     */
    OutData login(UserVo userVo);


}
