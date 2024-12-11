package com.bbering.springbootkafka.kafka;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {
  
  private static final org.apache.logging.log4j.Logger Logger = org.apache.logging.log4j.LogManager.getLogger(KafkaProducer.class);

  @KafkaListener(topics = "testTopic", groupId = "myGroup")
  public void consume (String message){
Logger.info(String.format("Message received" + message));
  }
}
