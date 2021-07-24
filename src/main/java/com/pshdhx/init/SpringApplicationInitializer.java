package com.pshdhx.init;

import com.pshdhx.config.ApplicationConfig;
import com.pshdhx.config.WebConfig;
import com.pshdhx.config.WebSecurityConfig;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 * 此类实现WebApplicationInitializer接口， Spring容器启动时加载WebApplicationInitializer接口的所有实现类。
 * 初始化spring容器
 */
//初始化类不需要注释
public class SpringApplicationInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

    //spring容器，相当于加载 applicationContext.xml,加载配置类。
    @Override
    protected Class<?>[] getRootConfigClasses() {
        //return new Class[]{ApplicationConfig.class};
        return new Class<?>[] { ApplicationConfig.class, WebSecurityConfig.class};
    }

    //servletContext，相当于加载springmvc.xml
    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{WebConfig.class};
    }

    //url-mapping
    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }
}