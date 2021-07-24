package com.pshdhx.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Controller;

/**
 * 对应web.xml中的ContextLoaderListener的配置【web-app/listenre/listener-class:
 *                                      org.springframework.web.context.ContextLoaderListener】
 * ApplicationConfig.class对应以下配置的application-context.xml，
 *                           【context-param/param-name:contextConfigLocation
 *                                           param-value/WEB‐INF/application‐context.xml:】
 */
@Configuration //相当于applicationContext.xml
@ComponentScan(basePackages = "com.pshdhx"
        ,excludeFilters = {@ComponentScan.Filter(type = FilterType.ANNOTATION,value = Controller.class)})
public class ApplicationConfig {
    //在此配置除了Controller的其它bean，比如：数据库链接池、事务管理器、业务bean等。
}
