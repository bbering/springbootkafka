package com.bbering.springbootkafka.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bbering.springbootkafka.kafka.KafkaProducer;

@RestController
@RequestMapping("/api/kafka")
public class KafkaController {

  private KafkaProducer kafkaProducer;

  public KafkaController(KafkaProducer kafkaProducer){
    this.kafkaProducer = kafkaProducer;
  }

  @GetMapping("/publish")
  public ResponseEntity<String> publish(@RequestParam("message") String message) {
    kafkaProducer.sendMessage(message);
    return new ResponseEntity<>(message, HttpStatus.OK);
  }
}
