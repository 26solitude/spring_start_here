package org.example.spring_start_here.ex8.service;

import org.example.spring_start_here.ex8.exceptions.NotEnoughMoneyException;
import org.example.spring_start_here.ex8.model.PaymentDetails;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    public PaymentDetails processPayment(){
        throw new NotEnoughMoneyException();
    }
}
