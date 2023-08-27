package ru.fedzeeor.simple.web.rest;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("msg")
public class SimpleKafkaController {

    private final KafkaTemplate<String, String> kafkaTemplate;

    public SimpleKafkaController(KafkaTemplate<String, String> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    @PostMapping
    public void sendOrder(String msgId, String msg) {
        System.out.println(String.format("before send kafka with key - %s and msg - %s", msgId, msg));
        kafkaTemplate.send("msg", msgId, msg);
        System.out.println(String.format("after send kafka with key - %s and msg - %s", msgId, msg));

    }
}
