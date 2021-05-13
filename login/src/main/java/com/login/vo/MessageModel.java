package com.login.vo;

import java.security.cert.PKIXCertPathValidatorResult;

/**
 * 封装相应对象
 */
public class MessageModel {
    private Integer code; // 状态码 0：失败 1：成功
    private String msg; // 提示信息

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    @Override
    public String toString() {
        return "MessageModel [code=" + code + ", msg=" + msg + "]";
    }

    
}
