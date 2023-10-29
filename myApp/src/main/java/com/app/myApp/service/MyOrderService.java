package com.app.myApp.service;

import com.app.myApp.model.MyOrder;
import com.app.myApp.model.Token;
import com.app.myApp.repo.IMyOrderRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class MyOrderService {
    @Autowired
    IMyOrderRepo myOrderRepo;
    @Autowired
    UserService userService;
    @Autowired
    TokenService tokenService;


    public String postOrder(MyOrder myOrder) {

         Token token = new Token(myOrder);
         tokenService.create(token);
         myOrderRepo.save(myOrder);

         return token.getToken();





//        myOrderRepo.save(myOrder);
//
//        return "order done";
    }

    public List<MyOrder> getOrder() {
        return myOrderRepo.findAll();
    }


    public String deleteOrder(String token, Integer orderId) {
        MyOrder order = myOrderRepo.findFirstByOrderId(orderId);
        if(order==null) {
            return "plese enter valid id and token";
        }
        else{
            myOrderRepo.delete(order);
            return tokenService.deleteToken(token);

        }


    }


    public MyOrder orderById(Integer id) {
        return myOrderRepo.findFirstByOrderId(id);
    }
}
