package com.ynov.messagerie.controllers;

import com.ynov.messagerie.models.Buyer;
import com.ynov.messagerie.services.BuyerServices;
import io.swagger.v3.oas.annotations.Operation;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("buyer")
public class BuyerController {
    @Autowired
    BuyerServices buyerServices;

    @PostMapping
    @Operation(summary = "create buyer", description = "Creates a new buyer in the database")
    public ResponseEntity<?> createSeller(@Valid @RequestBody Buyer buyer, BindingResult result){
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
                buyerServices.createBuyer(buyer),
                HttpStatus.CREATED
        );
    }

    @GetMapping
    @Operation(summary = "get all buyers", description = "Returns a list of all the buyers in the database")
    public ResponseEntity<List<Buyer>> getAllBuyers(){
        return new ResponseEntity<>(
                buyerServices.getAllBuyers(),
                HttpStatus.OK
        );
    }
}
