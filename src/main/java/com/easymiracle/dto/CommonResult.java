package com.easymiracle.dto;

public class CommonResult<T> {

    public CommonResult() {

    }

    public CommonResult(T t) {
        this.data = t;
    }

    public CommonResult(T t, int code, String message) {
        this.data = t;
        this.code = code;
        this.message = message;
    }

    private int code = 200;

    private T data;

    private String message;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
