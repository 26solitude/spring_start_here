package org.example.spring_start_here.ex9.controller;

import org.example.spring_start_here.ex9.model.Payment;
import org.example.spring_start_here.ex9.proxy.PaymentsProxy;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;
import java.util.logging.Logger;

@RestController
public class PaymentsController {

//    private static Logger logger = Logger.getLogger(PaymentsController.class.getName());
//
//
//    @PostMapping("/payment")
//    public ResponseEntity<Payment> createPayment(
//            @RequestHeader String requestId,
//            @RequestBody Payment payment
//    ) {
//        logger.info("Received request with ID " + requestId + " ;Payment Amount: " + payment.getAmount());
//
//        payment.setId(UUID.randomUUID().toString());
//
//        return ResponseEntity
//                .status(HttpStatus.OK)
//                .header("requestId", requestId)
//                .body(payment);
//
//    }


    private final PaymentsProxy paymentsProxy;

    public PaymentsController(PaymentsProxy paymentsProxy) {
        this.paymentsProxy = paymentsProxy;
    }

    @PostMapping("/payment")
    public Payment createPayment(
            @RequestBody Payment payment
    ) {
        String requestId = UUID.randomUUID().toString();
        return paymentsProxy.createPayment(requestId, payment);
    }

}
