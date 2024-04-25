package com.ynov.messagerie.controllers;

import com.ynov.messagerie.services.MessageServices;
import com.ynov.messagerie.models.Message;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("message")
public class MessageController {
    @Autowired
    MessageServices messageServices;

    @GetMapping
    @Operation(summary = "get all messages", description = "Returns a list of all the messages in the database")
    public ResponseEntity<List<Message>> getAllMessages(){
        return new ResponseEntity<>(
                messageServices.getAllMessages(),
                HttpStatus.OK
        );
    }

    @PostMapping
    @Operation(summary = "create message", description = "Creates a new message in the database")
    public ResponseEntity<Message> createMessage(@RequestBody Message message){
        return new ResponseEntity<>(
                messageServices.saveMessage(message),
                HttpStatus.CREATED
        );
    }
}
