package com.atliyuan.oa.common;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import java.io.Serializable;

/**
 * @author 黎源
 * @date 2020/1/15 15:41
 */
//@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
public class ServerResponse<T> implements Serializable {
    private Integer status;
    private String msg;
    private T data;

    private ServerResponse(Integer status) {
        this.status = status;
    }

    private ServerResponse(Integer status,T data) {
        this.status = status;
        this.data = data;
    }

    private ServerResponse(Integer status,T data,String msg) {
        this.status = status;
        this.data = data;
        this.msg = msg;
    }

    private ServerResponse(Integer status, String msg) {
        this.status = status;
        this.msg = msg;
    }

    @JsonIgnore
    public boolean isSuccess(){
        return this.status == ResponseCode.SUCCESS.getCode();
    }

    public Integer getStatus(){
        return status;
    }

    public String getMsg(){
        return msg;
    }

    public T getData(){
        return data;
    }

    //创建成功响应对象的方法
    public static <T> ServerResponse<T> createResposneBySuccess(){
        return new ServerResponse<T>(ResponseCode.SUCCESS.getCode());
    }

    public static <T> ServerResponse<T> createResposneBySuccessMessage(String msg){
        return new ServerResponse<T>(ResponseCode.SUCCESS.getCode(),msg);
    }

    public static <T> ServerResponse<T> createResposneBySuccess(T data){
        return new ServerResponse<T>(ResponseCode.SUCCESS.getCode(),data);
    }

    public static <T> ServerResponse<T> createResposneBySuccess(T data,String msg){
        return new ServerResponse<T>(ResponseCode.SUCCESS.getCode(),data,msg);
    }
    //创建失败  响应对象的方法
    public static <T> ServerResponse<T> createResposneByError(){
        return new ServerResponse<T>(ResponseCode.ERROR.getCode());
    }

    public static <T> ServerResponse<T> createResposneByError(String msg){
        return new ServerResponse<T>(ResponseCode.ERROR.getCode(),msg);
    }

    public static <T> ServerResponse<T> createResposneByError(int errorCode,String errorMsg){
        return new ServerResponse<T>(errorCode,errorMsg);
    }


}
