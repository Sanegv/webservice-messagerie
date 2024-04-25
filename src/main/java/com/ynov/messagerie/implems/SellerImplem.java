package com.ynov.messagerie.implems;

import com.ynov.messagerie.models.Seller;
import com.ynov.messagerie.repos.SellerRepo;
import com.ynov.messagerie.services.SellerServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SellerImplem implements SellerServices {
    @Autowired
    SellerRepo sellerRepo;

    @Override
    public Seller createSeller(Seller seller) {
        return sellerRepo.save(seller);
    }

    @Override
    public List<Seller> getAllSellers() {
        return sellerRepo.findAll();
    }
}
