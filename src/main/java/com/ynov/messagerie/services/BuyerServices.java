package com.ynov.messagerie.services;

import com.ynov.messagerie.models.Buyer;

import java.util.List;

public interface BuyerServices {
    Buyer createBuyer(Buyer buyer);
    List<Buyer> getAllBuyers();
}
