package com.example.rabbitmq.consumer;


import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(queues = {"topic.b"})
public class TopicConsumerB {

    @RabbitHandler
    public void topicHandle(String msg) {
        System.out.println("topic Handler B received: " + msg);
    }
}
