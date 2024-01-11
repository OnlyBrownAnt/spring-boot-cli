package com.example.cli.filter;

import org.springframework.web.servlet.HandlerInterceptor;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * token 验证拦截器
 */
public class TokenFilter implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) {
        if ("".equals(request.getHeader("token"))) {
            throw new RuntimeException("token 已失效，请重新登录！");
        }
        return true;
    }
}
