package com.ynov.messagerie.implems;

import com.ynov.messagerie.models.Bill;
import com.ynov.messagerie.repos.BillRepo;
import com.ynov.messagerie.services.BillServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BillImplem implements BillServices {
    @Autowired
    BillRepo billRepo;

    @Override
    public Bill createBill(Bill bill) {
        return billRepo.save(bill);
    }

    @Override
    public List<Bill> getAllBills() {
        return billRepo.findAll();
    }
}
