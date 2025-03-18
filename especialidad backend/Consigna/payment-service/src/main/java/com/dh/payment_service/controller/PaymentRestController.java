package com.dh.payment_service.controller;

import com.dh.payment_service.service.PaymentService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class PaymentRestController {

    private PaymentService paymentService;

    public PaymentRestController(PaymentService paymentService) {
        this.paymentService = paymentService;
        System.out.println("PaymentRestController cargado correctamente");
    }

    @GetMapping("/{supplier}/{amount}")
    public String paySupplier (@PathVariable String supplier, @PathVariable int amount) {
        return paymentService.paySupplier(supplier, amount);
    }
}
