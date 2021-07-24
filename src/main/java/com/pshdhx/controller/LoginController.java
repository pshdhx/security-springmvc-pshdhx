package com.pshdhx.controller;

import com.pshdhx.dto.AuthenticationRequest;
import com.pshdhx.dto.UserDto;
import com.pshdhx.service.AuthenticationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

@RestController
public class LoginController {

    @PostMapping(value="/login‐success",produces = "application/json;charset=UTF-8")
    public String loginSuccess(){
        return " 登录成功";
    }

    /*** 测试资源1
     * @return
     */
    @GetMapping(value = "/r/r1",produces = "application/json;charset=UTF-8")
    public String r1(){ return " 访问资源1"; }

    /*** 测试资源2
     *  @return
     */
    @GetMapping(value = "/r/r2",produces = "application/json;charset=UTF-8")
    public String r2(){ return " 访问资源2"; }


//    @Autowired
//    private AuthenticationService authenticationService;
//    @PostMapping(value="/login",produces = "application/json;charset=UTF-8")
//    public String login(AuthenticationRequest authenticationRequest, HttpSession session){
//        UserDto userDetails = authenticationService.authentication(authenticationRequest);
//        session.setAttribute(UserDto.SESSION_USER_KEY,userDetails);
//        return userDetails.getFullname() + " 登录成功";
//    }
//
//    @GetMapping(value = "logout",produces = "application/json;charset=UTF-8")
//    public String logout(HttpSession session){
//        session.invalidate();
//        return "退出成功";
//    }
//
//    @GetMapping(value = "/r/r1",produces = "application/json;charset=UTF-8")
//    public String r1(HttpSession session){
//        String fullname = null;
//        Object userObj = session.getAttribute(UserDto.SESSION_USER_KEY);
//        if(userObj != null){
//            fullname = ((UserDto)userObj).getFullname();
//        }else{
//            fullname = "匿名";
//        }
//        return fullname + " 访问资源1";
//    }
//
//    @GetMapping(value = "/r/r2",produces = "application/json;charset=UTF-8")
//    public String r2(HttpSession session){
//        String fullname = null;
//        Object userObj = session.getAttribute(UserDto.SESSION_USER_KEY);
//        if(userObj != null){
//            fullname = ((UserDto)userObj).getFullname();
//        }else{
//            fullname = "匿名";
//        }
//        return fullname + " 访问资源2";
//    }

}
