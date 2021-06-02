package com.sugon.gaowz.domain;

import java.io.Serializable;

/**
 * @program: workplace-sugon-salon
 * @description: 封装返回内容
 * @date: 22:31 2021/4/18
 * @author: gaowz
 **/
public class CommonResult<T> implements Serializable {

    private Integer code;
    private String message;
    private T data;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public CommonResult() {

    }

    public CommonResult(Integer code, String message) {
        this(code, message, null);
    }

    public CommonResult(Integer code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }
}
