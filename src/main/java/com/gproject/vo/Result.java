package com.gproject.vo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

@Data
public class Result implements Serializable {
    @ApiModelProperty(value = "是否成功")
    private Boolean status = true;
    @ApiModelProperty(value = "消息")
    private String msg;
    @ApiModelProperty(value = "状态码")
    private int code;
    @ApiModelProperty(value = "数据")
    private Object data;

//    private Map<String, Object> data = new HashMap<>();

    public static Result succe(Object data){
        return succe(ResultCode.SUCCESS.getCode(), ResultCode.SUCCESS.getMsg(), data);
    }

    public static Result succe(int code, String msg, Object data){
        Result r = new Result();
        r.setCode(code);
        r.setMsg(msg);
        r.setData(data);
        return r;
    }

    public static Result fail(String msg){
        return fail(ResultCode.COMMON_FAIL.getCode(),ResultCode.COMMON_FAIL.getMsg(), null);
    }

    public static Result fail(String msg, Object data){
        return fail(ResultCode.COMMON_FAIL.getCode(), ResultCode.COMMON_FAIL.getMsg(), data);
    }

    public static Result fail(int code, String msg, Object data){
        Result r = new Result();
        r.setCode(code);
        r.setMsg(msg);
        r.setData(data);
        return r;
    }
}
