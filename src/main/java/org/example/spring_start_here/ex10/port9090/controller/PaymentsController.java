package org.example.spring_start_here.ex10.port9090.controller;

import org.example.spring_start_here.ex10.port9090.model.Payment;
import org.example.spring_start_here.ex10.port9090.proxy.PaymentsProxy;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
public class PaymentsController {

    private final PaymentsProxy paymentsProxy;

    public PaymentsController(PaymentsProxy paymentsProxy){
        this.paymentsProxy = paymentsProxy;
    }

    @PostMapping("/payment")
    public Payment createPayment(
            @RequestBody Payment payment
    ){
        String requestId = UUID.randomUUID().toString();
        return paymentsProxy.createPayment(requestId, payment);
    }
}
