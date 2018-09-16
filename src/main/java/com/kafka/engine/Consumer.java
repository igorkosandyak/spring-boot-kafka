package com.kafka.engine;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.kafka.models.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class Consumer {

    private final Logger logger = LoggerFactory.getLogger(Producer.class);
    @Autowired
    private final ObjectMapper mapper = new ObjectMapper();

    @KafkaListener(topics = "users", groupId = "group_id")
    public void consume(String message) throws IOException {
        User user = mapper.readValue(message, User.class);
        logger.info(String.format("#### -> Consumed message -> %s", user));
    }

}
