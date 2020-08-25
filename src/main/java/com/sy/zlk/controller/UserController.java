package com.sy.zlk.controller;

import com.sy.common.model.User;
import com.sy.common.model.base.BaseResult;
import com.sy.zlk.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
//    @Autowired
//    private UserService service;

//    @RequestMapping("/login.do")
//    public BaseResult Login(String username, String password) {
//        User login = service.Login ( username, password );
//        BaseResult baseResult = new BaseResult ();
//        if (login != null) {
//            baseResult.setCode ( 0 );
//            baseResult.setMsg ( "登录成功" );
//        } else {
//            baseResult.setCode ( 1 );
//            baseResult.setMsg ( "登录失败" );
//        }
//   return baseResult;
//    }
}
