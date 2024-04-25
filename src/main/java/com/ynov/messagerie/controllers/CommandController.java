package com.ynov.messagerie.controllers;

import com.ynov.messagerie.models.Command;
import com.ynov.messagerie.services.CommandServices;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("command")
public class CommandController {
    @Autowired
    CommandServices commandServices;

    @GetMapping
    @Operation(summary = "get all commands", description = "Returns a list of all the commands in the database")
    public ResponseEntity<List<Command>> getAllCommands(){
        return new ResponseEntity<>(
                commandServices.getAllCommands(),
                HttpStatus.OK
        );
    }

    @PostMapping
    @Operation(summary = "create command", description = "Creates a new command in the database")
    public ResponseEntity<Command> createCommand(@RequestBody Command command){
        return new ResponseEntity<>(
                commandServices.createCommand(command),
                HttpStatus.CREATED
        );
    }
}
