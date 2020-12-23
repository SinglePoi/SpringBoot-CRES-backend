package com.gproject.vo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

@Data
public class Result implements Serializable {
    @ApiModelProperty(value = "是否成功")
    private Boolean status = true;
    @ApiModelProperty(value = "消息")
    private String msg;
    @ApiModelProperty(value = "状态码")
    private int code;
    @ApiModelProperty(value = "返回数据")
    private Map<String,Object> data = new HashMap<>();

    private Result(){

    }

    /**
     * 这里是使用链式编程
     */
    public static Result succe(){
        Result result = new Result();
        result.setStatus(true);
        result.setCode(ResultCode.SUCCESS.getCode());
        result.setMsg(ResultCode.SUCCESS.getMsg());
        return result;
    }

    public static Result error(){
        Result result = new Result();
        result.setStatus(false);
        result.setCode(ResultCode.COMMON_FAIL.getCode());
        result.setMsg(ResultCode.COMMON_FAIL.getMsg());
        return result;
    }
    /**
     * 自定义返回成功与否
     * @param success
     * @return
     */
    public Result status(Boolean success){
        this.setStatus(success);
        return this;
    }

    public Result message(String message){
        this.setMsg(message);
        return this;
    }

    public Result code(Integer code){
        this.setCode(code);
        return this;
    }

    public Result data(String key,Object value){
        this.data.put(key,value);
        return this;
    }

    public Result data(Map<String,Object> map){
        this.setData(map);
        return this;
    }

//    public static Result succe(Object data){
//        return succe(ResultCode.SUCCESS.getCode(), ResultCode.SUCCESS.getMsg(), data);
//    }
//
//    public static Result succe(int code, String msg, Object data){
//        Result r = new Result();
//        r.setCode(code);
//        r.setMsg(msg);
//        r.setData(data);
//        return r;
//    }
//
//    public static Result fail(String msg){
//        return fail(ResultCode.COMMON_FAIL.getCode(),ResultCode.COMMON_FAIL.getMsg(), null);
//    }
//
//    public static Result fail(String msg, Object data){
//        return fail(ResultCode.COMMON_FAIL.getCode(), ResultCode.COMMON_FAIL.getMsg(), data);
//    }
//
//    public static Result fail(int code, String msg, Object data){
//        Result r = new Result();
//        r.setCode(code);
//        r.setMsg(msg);
//        r.setData(data);
//        return r;
//    }
}
