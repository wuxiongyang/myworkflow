package com.example.workflow.CommonClass;

import lombok.Data;

import java.util.List;

/**
 * 对外相应信息类
 */
public class OutData {
    /**
     * 响应状态
     */
    private int code=0;
    /**
     * 响应信息
     */
    private String msg="";
    /**
     * 总数
     */
    private long total;
    /**
     * 数据
     */
    private List data ;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public long getTotal() {
        return total;
    }

    public void setTotal(long total) {
        this.total = total;
    }

    public List getData() {
        return data;
    }

    public void setData(List data) {
        this.data = data;
    }
}
