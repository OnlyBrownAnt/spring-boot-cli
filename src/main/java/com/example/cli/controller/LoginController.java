package com.example.cli.controller;

import com.example.cli.dto.CommonResult;
import com.example.cli.service.impl.ResponseServiceImpl;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
public class LoginController {
    private final ResponseServiceImpl responseServiceImpl;

    public LoginController(ResponseServiceImpl responseServiceImpl) {
        this.responseServiceImpl = responseServiceImpl;
    }

    @PostMapping(value = "/login")
    public CommonResult getRecords() {
        HashMap map = new HashMap();
        map.put("token", "token");
        return responseServiceImpl.success(map);
    }
}
