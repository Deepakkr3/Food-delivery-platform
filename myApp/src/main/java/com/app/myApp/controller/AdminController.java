package com.app.myApp.controller;

import com.app.myApp.model.MyOrder;
import com.app.myApp.model.Token;
import com.app.myApp.model.UserC;
import com.app.myApp.service.MyOrderService;
import com.app.myApp.service.TokenService;
import com.app.myApp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AdminController {
    @Autowired
    MyOrderService myOrderService;
    @Autowired
    UserService userService;
    @Autowired
    TokenService tokenService;
    @GetMapping("/users")
    public List<UserC> getUsers() {
        return userService.getUsers();
    }
    @GetMapping("/Tokens")
    public List<Token> getTokens() {
        return tokenService.getTokens();
    }
    @GetMapping("/order")
    public List<MyOrder> getOrder(){
        return myOrderService.getOrder();

    }
}
