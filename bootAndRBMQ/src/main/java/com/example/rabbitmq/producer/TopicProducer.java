package com.example.rabbitmq.producer;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TopicProducer {
    @Autowired
    private RabbitTemplate template;

    public void topic1Send() {
        System.out.println("t1 send");
        template.convertAndSend("topicExchange", "topic.msg", "This is a topic 1 message.");
    }

    public void topic2Send() {
                System.out.println("t2 send");
        template.convertAndSend("topicExchange", "topic.anything.is.ok", "This is a topic 2 message.");
    }

    public void topic3Send() {
        System.out.println("t3 send");
        template.convertAndSend("topicExchange", "topic.must.end.with.z", "This is a topic 3 message.");
    }

}
