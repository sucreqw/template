package com.easymiracle.exception;


import com.easymiracle.enums.ResultCodeEnum;

public class BizException extends RuntimeException {

    private int code;

    public BizException(int code,String message){
        super(message);
        this.code = code;
    }

    public BizException(ResultCodeEnum resultCodeEnum){
        super(resultCodeEnum.getMessage());
        this.code = resultCodeEnum.getCode();
    }


    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
    
}
