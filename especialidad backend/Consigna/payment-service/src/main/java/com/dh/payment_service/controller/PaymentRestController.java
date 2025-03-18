package src.main.java.com.dh.payment_service.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import src.main.java.com.dh.payment_service.service.PaymentService;

@RestController
@RequestMapping("/payment")
public class PaymentRestController {

    private PaymentService paymentService;

    public PaymentRestController(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    public String paySupplier (@PathVariable String supplier, @PathVariable int amount) {
        return paymentService.paySupplier(supplier, amount);
    }
}
