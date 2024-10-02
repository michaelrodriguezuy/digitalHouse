package com.digitalhouse.payments.service;


//esta clase es la encargada de publicar en el topico que se
// tiene que enviar una notificacion

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Service;


@Service
public class PublishNotification {

    //para enviar un mensaje a rabbit debemos instanciarlo
    private RabbitTemplate rabbitTemplate;

    public PublishNotification(RabbitTemplate rabbitTemplate) {
        this.rabbitTemplate = rabbitTemplate;
    }

    public void sendMessageToTopic(String message){

    //enviamos el nombre del topico y el mensaje
    rabbitTemplate.convertAndSend("send-notification", message);
}

}
