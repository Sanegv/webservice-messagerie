package com.ynov.messagerie.repos;

import com.ynov.messagerie.models.Buyer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BuyerRepo extends JpaRepository<Buyer, Long> {
    Buyer save(Buyer buyer);
}
