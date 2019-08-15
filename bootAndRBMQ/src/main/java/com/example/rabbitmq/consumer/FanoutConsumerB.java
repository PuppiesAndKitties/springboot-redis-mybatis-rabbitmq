package com.example.rabbitmq.consumer;


import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(queues = {"fanout.b"})
public class FanoutConsumerB {

    @Autowired
    private AmqpTemplate rabbitmqTemplate;

    @RabbitHandler
    public void received(String msg) {
        System.out.println("[fanout.b] received message: " + msg);
    }

}
