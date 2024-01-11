package com.example.cli.filter;

import com.example.cli.service.impl.ResponseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 全局异常处理器
 */
@ControllerAdvice
public class GlobalExceptionHandler {
    @Autowired
    private ResponseServiceImpl responseServiceImpl;
    @ResponseBody
    @ExceptionHandler(Exception.class)
    public Object globeExceptionHandle(Exception e) {
        return responseServiceImpl.failed(999999, e.getMessage());
    }
}
