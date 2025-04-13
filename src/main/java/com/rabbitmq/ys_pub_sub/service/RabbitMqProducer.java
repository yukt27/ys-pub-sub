package com.rabbitmq.ys_pub_sub.service;

import com.rabbitmq.ys_pub_sub.config.RabbitMqConfig;
import com.rabbitmq.ys_pub_sub.listener.RabbitMqListener;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Service;

@Service
public class RabbitMqProducer {

    private final RabbitTemplate rabbitTemplate;

    public RabbitMqProducer(RabbitTemplate rabbitTemplate, RabbitMqListener listener) {
        this.rabbitTemplate = rabbitTemplate;
    }

    public void sendMessage(String message) {
        rabbitTemplate.convertAndSend(RabbitMqConfig.EXCHANGE_NAME, "routing.key", message);
    }
}