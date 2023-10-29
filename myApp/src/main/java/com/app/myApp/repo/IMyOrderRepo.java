package com.app.myApp.repo;

import com.app.myApp.model.MyOrder;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IMyOrderRepo extends JpaRepository<MyOrder,Integer> {


    MyOrder findFirstByOrderId(Integer orderId);
}
