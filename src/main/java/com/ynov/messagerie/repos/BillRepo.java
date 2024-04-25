package com.ynov.messagerie.repos;

import com.ynov.messagerie.models.Bill;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository public interface BillRepo extends JpaRepository<Bill, Long> {
    Bill save(Bill bill);
}
