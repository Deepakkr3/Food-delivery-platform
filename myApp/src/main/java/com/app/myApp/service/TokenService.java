package com.app.myApp.service;

import com.app.myApp.model.Token;
import com.app.myApp.repo.ITokenRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class TokenService {
    @Autowired
    ITokenRepo tokenRepo;


    public void create(Token token) {
        tokenRepo.save(token);
    }

    public String remove(Integer id) {
        Token token = tokenRepo.findFirstByTokenId(id);
        if (token != null) {
            tokenRepo.delete(token);
            return token.getToken();
        }
        return "invalid credentials";

    }

    public String deleteToken(String token) {
        List<Token> tok=tokenRepo.findAll();
        if(tok.size()!=0) {
            String x= tok.get(0).getToken();
            tokenRepo.deleteAll(tok );
            return x+"token has been deleted";

        }
        return "plese enter vailid token";
    }

    public List<Token> getTokens() {
        return tokenRepo.findAll();
    }


}
