package org.example.spring_start_here.ex11.controller;

import org.example.spring_start_here.ex11.model.Purchase;
import org.example.spring_start_here.ex11.repository.PurchaseRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/purchase")
public class PurchaseController {

    private final PurchaseRepository purchaseRepository;

    public PurchaseController(PurchaseRepository purchaseRepository){
        this.purchaseRepository = purchaseRepository;
    }

    @PostMapping
    public void storePurchase(@RequestBody Purchase purchase){
        purchaseRepository.storePurchase(purchase);
    }

    @GetMapping
    public List<Purchase> findPurchases(){
        return purchaseRepository.findAllPurchases();
    }

}
