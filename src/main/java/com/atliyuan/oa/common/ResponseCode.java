package com.atliyuan.oa.common;

/**
 * @author 黎源
 * @date 2020/1/15 19:49
 */
public enum ResponseCode {
    SUCCESS(0, "success"),
    ERROR(1, "error"),
    NEED_LOGIN(10, "need login"),
    PARAMETER_EXCEPTION(20,"paramter excetption");

    private final int code;
    private final String desc;

    ResponseCode(int code,String desc){
        this.code = code;
        this.desc = desc;
    }

    public int getCode(){
        return code;
    }

    public String getDesc(){
        return desc;
    }
}
