package com.ynov.messagerie.controllers;

import com.ynov.messagerie.models.User;
import com.ynov.messagerie.services.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.PublicKey;

@RestController
@RequestMapping("user")
public class UserController {
    @Autowired
    UserServices userServices;

    @PostMapping
    public ResponseEntity<User> createUser(@RequestBody User user){
        return new ResponseEntity<>(
                userServices.createUser(user),
                HttpStatus.CREATED
        );
    }
}
