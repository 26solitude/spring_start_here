package org.example.spring_start_here.ex8.controller;

import org.example.spring_start_here.ex8.exceptions.NotEnoughMoneyException;
import org.example.spring_start_here.ex8.model.ErrorDetails;
import org.example.spring_start_here.ex8.model.PaymentDetails;
import org.example.spring_start_here.ex8.service.PaymentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.logging.Logger;

@RestController
public class PaymentController {

//    private final PaymentService paymentService;
//
//    public PaymentController(PaymentService paymentService){
//        this.paymentService = paymentService;
//    }
//
//    @PostMapping("/payment")
//    public ResponseEntity<?> makePayment(){
//        PaymentDetails paymentDetails = paymentService.processPayment();
//
//        return ResponseEntity
//                .status(HttpStatus.ACCEPTED)
//                .body(paymentDetails);
//    }

    private static Logger logger = Logger.getLogger(PaymentController.class.getName());

    @PostMapping("/payment")
    public ResponseEntity<PaymentDetails> makePayment(
            @RequestBody PaymentDetails paymentDetails){
        logger.info("Received payment " + paymentDetails.getAmount());

        return ResponseEntity
                .status(HttpStatus.ACCEPTED)
                .body(paymentDetails);
    }
}
