package com.example.rabbitmq.consumer;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(queues = "string")
public class DirectConsumer {

    @RabbitHandler
    public void received(String msg) {
        System.out.println("[string] received message: " + msg);
    }
}
