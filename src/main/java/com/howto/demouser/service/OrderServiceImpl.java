package com.howto.demouser.service;

import com.howto.demouser.model.Purchases;
import com.howto.demouser.model.Costumer;
import com.howto.demouser.serviceinterfaces.OrderService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl implements OrderService {

    @Override
    public ResponseEntity<Purchases> placeOrder(long id) {
        return null;
    }

    @Override
    public Iterable<Purchases> getAllOrdersFromUser(Costumer costumer) {
        return null;
    }

    @Override
    public Iterable<Purchases> getAllOrdersr() {
        return null;
    }
}
