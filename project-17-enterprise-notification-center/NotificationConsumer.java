package com.alhanoof.notification.kafka;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class NotificationConsumer {

    @KafkaListener(
            topics = "notification-topic",
            groupId = "notification-group")
    public void consume(String message) {

        System.out.println(
                "Received Notification: " + message
        );
    }
}
