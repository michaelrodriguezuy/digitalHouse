package com.digitalhouse.notification.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
public class NotificationConsumer {

    Logger logger = LoggerFactory.getLogger(NotificationConsumer.class);

    //este es el nombre de la cola que va a estar escuchando
    @RabbitListener(queues = "send-notification")
    public void consume(String message) {
        logger.info("Recibiendo mensaje del topico send-notification: "+message);
    }
}
