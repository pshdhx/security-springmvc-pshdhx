package com.pshdhx.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Set;

/**
 * 用户类
 */
@Data
@AllArgsConstructor
public class UserDto {
    public static final String SESSION_USER_KEY = "_user";
    private String id;
    private String username;
    private String password;
    private String fullname;
    private String mobile;


    /**
     * 定义用户权限
     */
    private Set<String> authorities;
}
