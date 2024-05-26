package com.example.RabbitMQExample.controller;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Producer {

    @Autowired
    private RabbitTemplate rabbitTemplate;

    @GetMapping("/send")
    public String send(@RequestParam String message) {
        rabbitTemplate.convertAndSend("QueueName", message);
        return "Message sent: " + message;
    }
}
