package com.howto.demouser.serviceinterfaces;

import com.howto.demouser.model.Purchases;
import com.howto.demouser.model.Costumer;
import org.springframework.http.ResponseEntity;


public interface OrderService {


    ResponseEntity<Purchases> placeOrder(long id);

    Iterable<Purchases> getAllOrdersFromUser(Costumer costumer);

    Iterable<Purchases> getAllOrdersr();
}
