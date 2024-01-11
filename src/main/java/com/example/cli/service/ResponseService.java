package com.example.cli.service;

import com.example.cli.dto.CommonResult;

/**
 * 报文响应 Service
 */
public interface ResponseService<T> {
    public CommonResult<T> success(T data);
    public CommonResult<T> failed(int code, String message);
}
