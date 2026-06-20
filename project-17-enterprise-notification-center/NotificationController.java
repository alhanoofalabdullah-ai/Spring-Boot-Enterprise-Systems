package com.alhanoof.notification.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/notifications")
public class NotificationController {

    @PostMapping("/send")
    public String sendNotification() {

        return "Notification Sent Successfully";
    }

    @GetMapping
    public String getNotifications() {

        return "Notifications Retrieved Successfully";
    }
}
