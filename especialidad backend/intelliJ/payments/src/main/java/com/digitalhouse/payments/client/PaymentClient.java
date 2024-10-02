package com.digitalhouse.payments.client;


//este seria un cliente Rest que crea el pago

import com.digitalhouse.payments.model.Payment;
import org.springframework.stereotype.Service;

@Service
public class PaymentClient {

    public Boolean createPayment(Payment payment) {
        //se ejecuta una llamada a un servicio externo para crear el pago

        return true;

    }
}
