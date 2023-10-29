package com.app.myApp.controller;

import com.app.myApp.model.UserC;
import com.app.myApp.service.EmailService;
import com.app.myApp.service.UserService;
import jakarta.validation.Valid;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;
//@Validated
@RestController
public class UserController {
    @Autowired
    UserService userService;

    //sign up
    @PostMapping("/signup/addNewUser")
    public String addUser(@RequestBody  UserC user){
        return userService.addUser(user);


    }
    //sig in
    @PostMapping("/signIn /email{email}/password/{password}")
    public String signIn(@PathVariable String email, @PathVariable String password){
        return userService.signIn(email, password);

    }

    //sign out
    @DeleteMapping("user/email{email}/password{password}")
    public String signOut(@PathVariable String email, @PathVariable String password){
        return  userService.signOut(email, password);
    }


}
