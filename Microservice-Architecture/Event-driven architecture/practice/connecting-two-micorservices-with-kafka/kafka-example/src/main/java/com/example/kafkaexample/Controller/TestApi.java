package com.example.kafkaexample.Controller;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/test")
public class TestApi {
    private final KafkaTemplate<String, String> kafkaTemplate;

    public TestApi(KafkaTemplate<String, String> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    @PostMapping
    public void sendDataToKafka(@RequestBody String s){
        kafkaTemplate.send("uniquecode", s);
    }
}
