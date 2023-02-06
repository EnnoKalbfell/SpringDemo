package com.howto.demouser.serviceinterfaces;

import com.howto.demouser.model.Costumer;
import org.springframework.http.ResponseEntity;

public interface UserService {
    ResponseEntity<Costumer> findUserById(long id);

    Costumer createUser(Costumer costumer);

    Iterable<Costumer> getAllUser();
}
