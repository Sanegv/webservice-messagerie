package com.ynov.messagerie.services;

import com.ynov.messagerie.models.Bill;

import java.util.List;

public interface BillServices {
    Bill createBill(Bill bill);
    List<Bill> getAllBills();
}
