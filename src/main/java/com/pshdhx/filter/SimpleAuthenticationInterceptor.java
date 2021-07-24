package com.pshdhx.filter;

import com.pshdhx.dto.UserDto;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * 实现授权拦截器【判断用户的权限，注意是授权，热不是认证】
 */
//配置了security，拦截器还拦截吗？好像不拦截了
//@Component
public class SimpleAuthenticationInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        //读取会话信息
        Object object = request.getSession().getAttribute(UserDto.SESSION_USER_KEY);
        if(object == null){
            writeContent(response,"qing denglu --请登录");
        }
        UserDto user = (UserDto) object;
        //请求的url
        String requestURI = request.getRequestURI();
        if(user.getAuthorities().contains("p1") && requestURI.contains("/r1")){
            return true;
        }
        if(user.getAuthorities().contains("p2") && requestURI.contains("/r2")){
            return true;
        }
        writeContent(response,"权限不足，拒绝访问");
        return false;
    }

    //响应输出
    private void writeContent(HttpServletResponse response, String msg) throws IOException {
        response.setContentType("application/json;charset=gbk"); //utf-8是乱码，所以设置了gbk
        PrintWriter writer = response.getWriter();
        writer.print(msg);
        writer.close();
        response.resetBuffer();
    }


    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

    }
}
