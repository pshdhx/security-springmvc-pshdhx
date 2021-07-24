package com.pshdhx.dto;

import lombok.Data;

/**
 * 认证请求结构【前端传递的参数】
 */
@Data
public class AuthenticationRequest {
    private String username;
    private String password;
}
