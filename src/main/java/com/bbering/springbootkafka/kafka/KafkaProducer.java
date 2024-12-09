package com.bbering.springbootkafka.kafka;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaProducer {

  private static final org.apache.logging.log4j.Logger Logger = org.apache.logging.log4j.LogManager.getLogger(KafkaProducer.class);

  private KafkaTemplate<String, String> kafkaTemplate;

  public KafkaProducer(KafkaTemplate<String, String> kafkaTemplate) {
    this.kafkaTemplate = kafkaTemplate;
  }

  public void sendMessage(String message) {
    Logger.info(String.format("Message sent %s", message));
    kafkaTemplate.send("myTopic", message);
  }

}
