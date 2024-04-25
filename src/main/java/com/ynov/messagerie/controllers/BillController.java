package com.ynov.messagerie.controllers;

import com.ynov.messagerie.models.Bill;
import com.ynov.messagerie.services.BillServices;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("bill")
public class BillController {
    @Autowired
    BillServices billServices;

    @PostMapping
    @Operation(summary = "create bill", description = "Creates a new bill in the database")
    public ResponseEntity<Bill> createBill(@RequestBody Bill bill){
        return new ResponseEntity<>(
                billServices.createBill(bill),
                HttpStatus.CREATED
        );
    }

    @GetMapping
    @Operation(summary = "get all bills", description = "Returns a list of all the bills in the database")
    public ResponseEntity<List<Bill>> getAllBills(){
        return new ResponseEntity<>(
                billServices.getAllBills(),
                HttpStatus.OK
        );
    }
}
