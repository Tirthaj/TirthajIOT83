package com.example.kafkaboot2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class Consumer {

    @Autowired
    MessageRepository messageRepository;

    @KafkaListener(topics = "test_topic",groupId = "group_id")
    public void consumeMessage(String message){
        Message messageobj = new Message(message);
        messageRepository.save(messageobj);
        System.out.println("In Cons:" +  message);
    }
}