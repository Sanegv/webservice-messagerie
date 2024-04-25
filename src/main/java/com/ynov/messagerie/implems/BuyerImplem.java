package com.ynov.messagerie.implems;

import com.ynov.messagerie.models.Buyer;
import com.ynov.messagerie.repos.BuyerRepo;
import com.ynov.messagerie.services.BuyerServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BuyerImplem implements BuyerServices {
    @Autowired
    BuyerRepo buyerRepo;

    @Override
    public Buyer createBuyer(Buyer buyer) {
        return buyerRepo.save(buyer);
    }
}
