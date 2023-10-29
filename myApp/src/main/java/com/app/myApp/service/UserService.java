package com.app.myApp.service;

import com.app.myApp.model.Token;
import com.app.myApp.model.UserC;
import com.app.myApp.repo.IUserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.security.NoSuchAlgorithmException;
import java.util.List;

@Component
public class UserService {
    @Autowired
    TokenService tokenService;
    @Autowired
    IUserRepo userRepo;

    public String postUser(UserC newUser) {
        userRepo.save(newUser);
        return "saved";
    }

    public List<UserC> getUsers() {
        return userRepo.findAll();
    }

    public String addUser(UserC user) {
        String userEmail=user.getUserEmail();
        UserC existingUser=userRepo.findFirstByUserEmail(userEmail);
        if(existingUser!=null){
            return "this is already existing user plese try to sign in";

        }
        else{
            try {
                String password =PaswordEncriptor.encrypt(user.getUserPassword());
                user.setUserPassword(password);
                userRepo.save(user);
                return "user created successfully";
            } catch (NoSuchAlgorithmException e) {
                return "not such pasword";
            }


            //incripted pasword

        }
    }

    public String signIn(String email, String password) {
        UserC existingUser=userRepo.findFirstByUserEmail(email);
        if(existingUser==null){
            return "user not found";
        }
        else {
            try {
                String encryptedPassword=PaswordEncriptor.encrypt(password);
                if(existingUser.getUserPassword().equals(encryptedPassword)){
                    Token token = new Token(existingUser.getUserId());
                   tokenService.create(token);
                   EmailService.sendEmail(email,"your token",token.getToken());
                    return "your token-"+token.getToken();
                    //return "reached";


                }
                else {
                    return "invalid ";
                }
            } catch (NoSuchAlgorithmException e) {
                return "password not valid";
            }
        }


    }

    public String signOut(String email, String password) {
        UserC existingUser=userRepo.findFirstByUserEmail(email);
        if(existingUser==null){
            return "invalid email";

        }
        else{
            try {
                String encriptedPasword=PaswordEncriptor.encrypt(password);
                if(existingUser.getUserPassword().equals(encriptedPasword)){
                    Integer id=existingUser.getUserId();
                    String status=tokenService.remove(id);
                    userRepo.delete(existingUser);
                    return "token deleted"+status;


                }
                else{
                    return "invalid password";
                }
            } catch (NoSuchAlgorithmException e) {
                throw new RuntimeException(e);
            }


        }


    }
}
