package com.joe.Controller;

import com.joe.Service.EmailNotifierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/email-notifiers")
public class EmailNotifierController {

    @Autowired
    private EmailNotifierService emailService;

    @PostMapping("/upsert")
    public ResponseEntity<String> upsertEmailNotifications() {
        emailService.upsertEmailNotifications();
        return ResponseEntity.ok("Email notifications upserted successfully.");
    }}
