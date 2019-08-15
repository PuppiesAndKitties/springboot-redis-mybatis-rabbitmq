package com.example.rabbitmq.consumer;


import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(queues = {"topic.c"})
public class TopicConsumerC {

    @RabbitHandler
    public void topicHandle(String msg) {
        System.out.println("topic Handler C received: " + msg);
    }
}
