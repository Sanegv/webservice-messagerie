package com.ynov.messagerie.services;

import com.ynov.messagerie.models.Seller;

import java.util.List;

public interface SellerServices {
    Seller createSeller(Seller seller);
    List<Seller> getAllSellers();
}
