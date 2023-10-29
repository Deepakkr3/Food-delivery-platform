package com.app.myApp.model;

import jakarta.persistence.*;
import org.springframework.beans.factory.annotation.Autowired;

@Entity
public class MyOrder {
    @Id
    private Integer orderId;
    private String orderName;
    @Enumerated(EnumType.STRING)
    private Resturant resturant;
    @Enumerated(EnumType.STRING)
    private Menue menue;

    @ManyToOne
    @JoinColumn(name="user")
    private UserC user;

    public MyOrder() {
    }

    public MyOrder(Integer orderId, String orderName, Resturant resturant, Menue menue, UserC user) {
        this.orderId = orderId;
        this.orderName = orderName;
        this.resturant = resturant;
        this.menue = menue;
        this.user = user;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public String getOrderName() {
        return orderName;
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName;
    }

    public Resturant getResturant() {
        return resturant;
    }

    public void setResturant(Resturant resturant) {
        this.resturant = resturant;
    }

    public Menue getMenue() {
        return menue;
    }

    public void setMenue(Menue menue) {
        this.menue = menue;
    }

    public UserC getUser() {
        return user;
    }

    public void setUser(UserC user) {
        this.user = user;
    }
}
