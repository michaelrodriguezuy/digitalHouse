package com.digitalhouse.payments.restcontroller;

import com.digitalhouse.payments.model.Payment;
import com.digitalhouse.payments.service.PaymentService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/payments")
public class PaymentRestController {

    private PaymentService paymentService;

    public PaymentRestController(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    @PostMapping()
    public void CreatePayment(@RequestBody Payment payment){

        paymentService.createPayment(payment);



    }
}
