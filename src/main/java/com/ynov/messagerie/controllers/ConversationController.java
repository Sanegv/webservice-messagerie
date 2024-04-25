package com.ynov.messagerie.controllers;

import com.ynov.messagerie.models.Conversation;
import com.ynov.messagerie.services.ConversationServices;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("conversation")
public class ConversationController {
    @Autowired
    ConversationServices conversationServices;

    @GetMapping
    @Operation(summary = "get all conversations", description = "Returns a list of all the conversations in the database")
    public ResponseEntity<List<Conversation>> getAllConversations(){
        return new ResponseEntity<>(
                conversationServices.getAllConversations(),
                HttpStatus.OK
        );
    }

    @PostMapping
    @Operation(summary = "create conversation", description = "Creates a new conversation in the database")
    public ResponseEntity<Conversation> createConversation(@RequestBody Conversation conversation){
        return new ResponseEntity<>(
                conversationServices.createConversation(conversation),
                HttpStatus.CREATED
        );
    }

    @GetMapping
    @RequestMapping("{id}")
    @Operation(summary = "get conversation by id", description = "Returns either \"NOT FOUND\" status, or the conversation with matching Id")
    public ResponseEntity<?> getConversation(@PathVariable Long id){
        Optional<Conversation> response = conversationServices.getConversationById(id);

        if(response.isEmpty()){
            return new ResponseEntity<>(
                    HttpStatus.NOT_FOUND
            );
        }
        return new ResponseEntity<>(
                response,
                HttpStatus.OK
        );
    }
}
