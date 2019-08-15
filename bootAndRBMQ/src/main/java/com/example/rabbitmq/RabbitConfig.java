package com.example.rabbitmq;

import org.springframework.amqp.core.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitConfig {

    // ----------------------- workerQueue Mode . Only define one queue
    @Bean
    public Queue string() {
        return new Queue("string");
    }

    // ----------------------- fanout mode. Define 3 queues and 1 exchange, and respectively bind each queue with the exchange
    @Bean
    public Queue fanoutA() {
        return new Queue("fanout.a");
    }

    @Bean
    public Queue fanoutB() {
        return new Queue("fanout.b");
    }

    @Bean
    public Queue fanoutC() {
        return new Queue("fanout.c");
    }

    @Bean
    FanoutExchange fanoutExchange() {
        return new FanoutExchange("fanoutExchange");
    }

    @Bean
    public Binding bindingExchangeToA() {
        return BindingBuilder.bind(fanoutA()).to(fanoutExchange());
    }

    @Bean
    public Binding bindingExchangeToB() {
        return BindingBuilder.bind(fanoutB()).to(fanoutExchange());
    }

    @Bean
    public Binding bindingExchangeToC() {
        return BindingBuilder.bind(fanoutC()).to(fanoutExchange());
    }

    // ------------------------------ topic mode . Define 3 queues, 1 exchange and 3 routing key

    @Bean
    public Queue topicQueueA() {
        return new Queue("topic.a");
    }

    @Bean
    public Queue topicQueueB() {
        return new Queue("topic.b");
    }

    @Bean
    public Queue topicQueueC() {
        return new Queue("topic.c");
    }

    @Bean
    TopicExchange topicExchange() {
        return new TopicExchange("topicExchange");
    }

    @Bean
    public Binding bindingTopicExchangeToAWithTopic() {
        return BindingBuilder.bind(topicQueueA()).to(topicExchange()).with("topic.msg");
    }

    @Bean
    public Binding bindingTopicExchangeToBWithTopic() {
        return BindingBuilder.bind(topicQueueB()).to(topicExchange()).with("topic.#");
    }

    @Bean
    public Binding bindingTopicExchangeToCWithTopic() {
        return BindingBuilder.bind(topicQueueC()).to(topicExchange()).with("topic.#.z");
    }

}
