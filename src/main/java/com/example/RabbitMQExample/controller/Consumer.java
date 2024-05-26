package com.example.RabbitMQExample.controller;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class Consumer {

    @RabbitListener(queues = "QueueName")
    public void receiveMessage(String message) {
        System.out.println("Received message: " + message);
    }
}
