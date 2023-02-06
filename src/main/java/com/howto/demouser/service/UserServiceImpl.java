package com.howto.demouser.service;

import com.howto.demouser.model.Costumer;
import com.howto.demouser.repository.UserRepository;
import com.howto.demouser.serviceinterfaces.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public ResponseEntity<Costumer> findUserById(long id) {
        Optional<Costumer> us = userRepository.findById(id);
        return us.map(userModel -> ResponseEntity.ok().body(userModel)).orElseGet(() -> ResponseEntity.notFound().build());
    }

    public Costumer createUser(Costumer costumer) {
        //To do: add some form of validation of the new user or better said the input

        return userRepository.save(costumer);
    }

    public Iterable<Costumer> getAllUser() {
        return userRepository.findAll();
    }
}
