package com.pumpkin.common.exception;

/**
 * @author pumpkin
 * @date 2022/2/14 0014 下午 22:59
 */
public enum BizCodeEnum {
    UNKNOW_EXCEPTION(10000,"系统未知异常"),
    VALID_MATHOD(10001,"方法参数无效");

    private int code ;
    private String message ;
    private BizCodeEnum(int code ,String message){
        this.code = code ;
        this.message = message ;
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
