package com.easymiracle.enums;

public enum ResultCodeEnum {

    SUCCESS(200, "success"),
    ERROR(500, "error"),
    ACCOUNT_ERROR(501, "用户名或密码错误");

    private int code;

    private String message;

    ResultCodeEnum(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
