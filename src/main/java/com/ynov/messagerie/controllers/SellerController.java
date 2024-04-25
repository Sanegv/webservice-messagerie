package com.ynov.messagerie.controllers;

import com.ynov.messagerie.models.Seller;
import com.ynov.messagerie.services.SellerServices;
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
@RequestMapping("seller")
public class SellerController {
    @Autowired
    SellerServices sellerServices;

    @PostMapping
    @Operation(summary = "create seller", description = "Creates a new seller in the database")
    public ResponseEntity<?> createSeller(@Valid @RequestBody Seller seller, BindingResult result){
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
                sellerServices.createSeller(seller),
                HttpStatus.CREATED
        );
    }

    @GetMapping
    @Operation(summary = "get all sellers", description = "Returns a list of all the sellers in the database")
    public ResponseEntity<List<Seller>> getAllSellers(){
        return new ResponseEntity<>(
                sellerServices.getAllSellers(),
                HttpStatus.OK
        );
    }
}
