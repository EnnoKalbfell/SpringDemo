package com.howto.demouser.service;

import com.howto.demouser.model.Order;
import com.howto.demouser.model.Costumer;
import com.howto.demouser.serviceinterfaces.OrderService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl implements OrderService {

    @Override
    public ResponseEntity<Order> placeOrder(long id) {
        return null;
    }

    @Override
    public Iterable<Order> getAllOrdersFromUser(Costumer costumer) {
        return null;
    }

    @Override
    public Iterable<Order> getAllOrdersr() {
        return null;
    }
}
