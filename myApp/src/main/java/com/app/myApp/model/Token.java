package com.app.myApp.model;

import jakarta.persistence.*;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.UUID;
@Entity
@Component
public class Token {

    @Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer tokenId;
    private String token;
    private LocalDateTime tokenCreationDateTime;

    //mapping



    //create a parameterized constructor which takes user as an argument
    public Token(Integer id)
    {
        this.tokenId = id;
        this.token = UUID.randomUUID().toString();
        this.tokenCreationDateTime = LocalDateTime.now();
    }

    public Token() {
    }

    public Token(Integer tokenId, String token, LocalDateTime tokenCreationDateTime) {
        this.tokenId = tokenId;
        this.token = token;
        this.tokenCreationDateTime = tokenCreationDateTime;
    }

    public Token(MyOrder myOrder) {
        this.tokenId = myOrder.getOrderId();
        this.token = UUID.randomUUID().toString();
        this.tokenCreationDateTime = LocalDateTime.now();

    }

    public Integer getTokenId() {
        return tokenId;
    }

    public void setTokenId(Integer tokenId) {
        this.tokenId = tokenId;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public LocalDateTime getTokenCreationDateTime() {
        return tokenCreationDateTime;
    }

    public void setTokenCreationDateTime(LocalDateTime tokenCreationDateTime) {
        this.tokenCreationDateTime = tokenCreationDateTime;
    }
}
