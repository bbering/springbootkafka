package com.bbering.springbootkafka.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaConfig {

  public NewTopic myTopic() {
    return TopicBuilder.name("myTopic")
        .build();
  }
}
