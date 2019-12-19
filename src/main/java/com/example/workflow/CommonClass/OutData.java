package com.example.workflow.CommonClass;

import lombok.Data;

import java.util.List;

/**
 * 对外相应信息类
 */
@Data
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
}
