package com.rabbitmq.ys_pub_sub.controller;

import com.rabbitmq.ys_pub_sub.service.RabbitMqProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RabbitMqController {

    @Autowired
    private RabbitMqProducer producer;

    @GetMapping("/send")
    public String sendMessage(@RequestBody String message) {
        producer.sendMessage(message);
        return message;
    }
}