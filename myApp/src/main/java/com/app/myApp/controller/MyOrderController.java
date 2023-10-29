package com.app.myApp.controller;

import com.app.myApp.model.Menue;
import com.app.myApp.model.MyOrder;
import com.app.myApp.model.Resturant;
import com.app.myApp.service.MyOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MyOrderController {


    @Autowired
    MyOrderService myService;
    @PostMapping("/order")
    public String postOrder(@RequestBody MyOrder myOrder){

        return myService.postOrder(myOrder);
    }
    //order by id
    @GetMapping("/order/id")
    public MyOrder orderById(@RequestParam Integer id){
       return myService.orderById(id);
    }


    @DeleteMapping("/order")
    public String deleteOrder(@RequestParam String token,@RequestParam Integer orderId){
        return myService.deleteOrder(token,orderId);

    }



}
