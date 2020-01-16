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

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getValidatecode() {
        return validatecode;
    }

    public void setValidatecode(String validatecode) {
        this.validatecode = validatecode;
    }
}
