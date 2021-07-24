package com.pshdhx.config;

import com.pshdhx.filter.SimpleAuthenticationInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

/**
 *
 * spring- mvc.xml
 *它对应于DispatcherServlet配置==spring- mvc.xml
 * WebConfig.class对应以下配置的spring- mvc.xml，【servlet/servlet-name;springmvc
 *                                                        servlet-class:org.springframework.web.servlet.DispatcherServlet
 *                                                init-param/param-name:contextConfigLocation
 *                                                           param-value:/WEB‐INF/spring‐mvc.xml
 *                                                 servlet-mapping/servlet-name:springmvc
 *                                                                 url-pattern:/】
 */
@Configuration//就相当于springmvc.xml文件
@EnableWebMvc
@ComponentScan(basePackages = "com.pshdhx"
        ,includeFilters = {@ComponentScan.Filter(type = FilterType.ANNOTATION,value = Controller.class)})
public class WebConfig implements WebMvcConfigurer {

    //拦截用户的请求【security来控制，不用web容器来控制了】
//    @Autowired
//    private SimpleAuthenticationInterceptor simpleAuthenticationInterceptor;



    //视频解析器
    @Bean
    public InternalResourceViewResolver viewResolver(){
        InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
        viewResolver.setPrefix("/WEB-INF/view/");
        viewResolver.setSuffix(".jsp");
        return viewResolver;
    }

    //视图解析器 定向到 psdLogin.jsp
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/").setViewName("redirect:/login");
    }

    //拦截用户的请求【security来控制，不用web容器来控制了】
//    @Override
//    public void addInterceptors(InterceptorRegistry registry) {
//        registry.addInterceptor(simpleAuthenticationInterceptor).addPathPatterns("/r/**");
//    }


}


