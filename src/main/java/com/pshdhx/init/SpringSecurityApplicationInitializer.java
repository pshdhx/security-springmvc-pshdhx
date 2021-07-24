package com.pshdhx.init;

import org.springframework.security.web.context.AbstractSecurityWebApplicationInitializer;

/**
 * 初始化security
 */
//初始化类不需要注释
public class SpringSecurityApplicationInitializer extends AbstractSecurityWebApplicationInitializer {
    public SpringSecurityApplicationInitializer() {
//        如果配置了spring容器初始化，此处注释即可。因为spring初始化加载了webSecurityConfig.class;
        //super(WebSecurityConfig.class);
    }
}
