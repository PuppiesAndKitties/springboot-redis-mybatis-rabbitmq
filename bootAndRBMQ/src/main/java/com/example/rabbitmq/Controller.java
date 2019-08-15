package com.example.rabbitmq;


import com.example.rabbitmq.producer.FanoutProducer;
import com.example.rabbitmq.producer.DirectProducer;
import com.example.rabbitmq.producer.TopicProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @Autowired
    private DirectProducer producer;

    @Autowired
    private FanoutProducer fanoutProducer;

    @Autowired
    private TopicProducer topicProducer;

    @RequestMapping(value = "/workerQueue")
    public String workerQueueTest() {
        System.out.println("Testing");
        for (int i = 0; i < 9; i++) {
            producer.stringSend();
        }
        return "OK";
    }

    @RequestMapping(value = "/fanout")
    public String fanoutTest() {
        System.out.println("FanoutTesting");
        for (int i = 0; i < 3; i++) {
            fanoutProducer.fanoutSend();
        }
        return "Fanout OK";
    }

    @RequestMapping(value = "/topic")
    public String topicTest() {
        System.out.println("TopicTesting");
        for (int i = 0; i < 3; i++) {
            topicProducer.topic1Send();
            topicProducer.topic2Send();
            topicProducer.topic3Send();
        }
        return "Topic OK";
    }
}
