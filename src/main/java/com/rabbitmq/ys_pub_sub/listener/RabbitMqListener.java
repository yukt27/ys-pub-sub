package com.rabbitmq.ys_pub_sub.listener;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class RabbitMqListener {

    @RabbitListener(queues = "myQueue")
    public void listen(String message) {
        System.out.println("Received message: " + message);
    }
}
