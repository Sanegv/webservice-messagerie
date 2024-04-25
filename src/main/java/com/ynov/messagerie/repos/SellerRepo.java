package com.ynov.messagerie.repos;

import com.ynov.messagerie.models.Seller;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SellerRepo extends JpaRepository<Seller, Long> {
    Seller save(Seller seller);
    List<Seller> findAll();
}
