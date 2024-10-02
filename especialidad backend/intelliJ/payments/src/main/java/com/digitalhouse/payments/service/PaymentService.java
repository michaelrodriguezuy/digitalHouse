package com.digitalhouse.payments.service;

import com.digitalhouse.payments.client.PaymentClient;
import com.digitalhouse.payments.model.Payment;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    private PublishNotification publishNotification;

    private PaymentClient paymentClient;

    public void createPayment(Payment payment) {

        //aca vamos a crear el payment
        paymentClient.createPayment(payment);

        //aca enviamos a un topico una notificacion
        publishNotification.sendMessageToTopic("ID de usuario que compro: "+ payment.getClientId());

    }

    public PaymentService(PaymentClient paymentClient, PublishNotification publishNotification) {
        this.paymentClient = paymentClient;
        this.publishNotification = publishNotification;
    }
}
