package com.pshdhx.service;

import com.pshdhx.dto.AuthenticationRequest;
import com.pshdhx.dto.UserDto;

/**
 * 认证服务
 */
public interface AuthenticationService {
    /**
     * 用户认证
     * @param authenticationRequest
     * @return
     */
    UserDto authentication(AuthenticationRequest authenticationRequest);
}
