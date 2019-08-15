package com.example.rabbitmq.consumer;


import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component // do never forget this configuration, or this Class will not be scanned by the Spring Container.
@RabbitListener(queues = "topic.a")
public class TopicConsumerA {

    @RabbitHandler
    public void received(String msg) {
        System.out.println("topic Handler A received: " + msg);
    }
}
