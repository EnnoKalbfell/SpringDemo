package com.howto.demouser.controller;

import com.howto.demouser.dao.UserDao;
import com.howto.demouser.mapper.UserMapper;
import com.howto.demouser.model.Costumer;
import com.howto.demouser.service.UserServiceImpl;
import com.howto.demouser.serviceinterfaces.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/user")
public class UserController {

    private final UserService userService;
    private final UserMapper userMapper;

    @Autowired
    public UserController(UserServiceImpl userService, UserMapper userMapper) {
        this.userService = userService;
        this.userMapper = userMapper;
    }

    @PostMapping(path = "/")
    public ResponseEntity<UserDao> addNewUser(@RequestBody UserDao userDao) {
        return ResponseEntity.ok(userMapper.toDao(userService.createUser(userMapper.fromDao(userDao))));
    }

    @GetMapping(path = "/")
    public @ResponseBody Iterable<Costumer> getAllUsers() {
        return userService.getAllUser();
    }

    @GetMapping(path = "/{id}")
    public @ResponseBody ResponseEntity<Costumer> getUserById(@PathVariable(value = "id") long id) {
        return userService.findUserById(id);
    }
}