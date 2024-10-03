package com.digitalhouse.payments.restcontroller;

import com.digitalhouse.payments.model.Payment;
import com.digitalhouse.payments.service.PaymentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/payments")
public class PaymentRestController {

    private PaymentService paymentService;

    Logger logger = LoggerFactory.getLogger(PaymentRestController.class);

    public PaymentRestController(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    @GetMapping()
    public Payment getPayment(String id){
        logger.info("Intentando obtener payment con id: "+id);
        return new Payment(id,500.0f,"id 1", "id 2");
    }

    @PostMapping()
    public void CreatePayment(@RequestBody Payment payment){

        paymentService.createPayment(payment);



    }
}
