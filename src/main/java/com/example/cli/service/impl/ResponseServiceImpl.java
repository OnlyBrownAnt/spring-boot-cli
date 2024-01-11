package com.example.cli.service.impl;

import com.example.cli.dto.CommonResult;
import com.example.cli.service.ResponseService;
import org.springframework.stereotype.Service;

/**
 * 响应报文 Body 实现类
 */
@Service
public class ResponseServiceImpl<T> implements ResponseService<T> {
    @Override
    public CommonResult<T> success(T map) {
        return CommonResult.success(200, "success", map);
    }

    @Override
    public CommonResult<T> failed(int code, String message) {
        return CommonResult.failed(code, message);
    }
}
