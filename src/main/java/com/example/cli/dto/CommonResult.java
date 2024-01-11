package com.example.cli.dto;

/**
 * 公共响应数据 DTO
 */
public class CommonResult<T> {
    /**
     * 状态码
     */
    private int code;
    /**
     * 提示信息
     */
    private String message;

    /**
     * 返回数据
     */
    private T data;

    protected CommonResult(T data) {
        this.data = data;
    }

    protected CommonResult(int code, String message) {
        this.code = code;
        this.message = message;
    }

    protected CommonResult(int code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public static <T> CommonResult<T> success(int code, String message, T data) {
        return new CommonResult<T>(code, message, data);
    }

    public static <T> CommonResult<T> failed(int code, String message) {
        return new CommonResult<T>(code, message);
    }

    public long getCode() {
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

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
