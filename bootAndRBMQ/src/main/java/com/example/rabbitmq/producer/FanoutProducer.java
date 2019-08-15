package com.example.rabbitmq.producer;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class FanoutProducer {

    @Autowired
    private AmqpTemplate template;

    public void fanoutSend() {
        String msg = "This is a fanout message";
        System.out.println("fanout send once");
        template.convertAndSend("fanoutExchange", "", msg);
    }
}
