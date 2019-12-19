package com.example.workflow.vo;

import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @Author:wuxiongyang
 * @Date: 2019/10/13
 * @Time: 14:39
 */
@Data
public class UserVo {
    private Integer id;
    /**
     * 验证码
     */
    private String userName;
    /**
     * 验证码
     */
    private String passWord;
    /**
     * 验证码
     */
    private String realName;
    /**
     * 验证码
     */
    private String validatecode;

}
