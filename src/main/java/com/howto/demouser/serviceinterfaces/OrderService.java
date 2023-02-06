package com.howto.demouser.serviceinterfaces;

import com.howto.demouser.model.Order;
import com.howto.demouser.model.Costumer;
import org.springframework.http.ResponseEntity;


public interface OrderService {


    ResponseEntity<Order> placeOrder(long id);

    Iterable<Order> getAllOrdersFromUser(Costumer costumer);

    Iterable<Order> getAllOrdersr();
}
