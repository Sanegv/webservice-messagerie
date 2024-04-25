package com.ynov.messagerie.controllers;

import com.ynov.messagerie.models.User;
import com.ynov.messagerie.services.UserServices;
import io.swagger.v3.oas.annotations.Operation;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.bind.BindResult;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.PublicKey;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("user")
public class UserController {
    @Autowired
    UserServices userServices;

    @PostMapping
    @Operation(summary = "create user", description = "This route creates users with the given body")
    public ResponseEntity<?> createUser(@Valid @RequestBody User user, BindingResult result){
        if(result.hasErrors()){
            List<String> errorMessages = new ArrayList<>();
            result.getAllErrors().forEach(
                    error -> errorMessages.add(
                            error.getDefaultMessage()
                    )
            );
            return new ResponseEntity<>(
                    errorMessages,
                    HttpStatus.BAD_REQUEST
            );
        }
        return new ResponseEntity<>(
                userServices.createUser(user),
                HttpStatus.CREATED
        );
    }
}
