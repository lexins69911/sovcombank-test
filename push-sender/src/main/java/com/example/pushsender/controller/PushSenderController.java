package com.example.pushsender.controller;

import com.example.pushsender.exception.InnerPushSenderIntegrationException;
import com.example.pushsender.service.PushSenderIntegrationService;
import com.example.pushsender.pojo.Recipient;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/sender/push")
@RequiredArgsConstructor
public class PushSenderController {

    private final PushSenderIntegrationService pushSenderIntegrationService;

    @PostMapping("/send")
    public ResponseEntity<?> sendEmail(@RequestBody Recipient recipient) {

        try {

            pushSenderIntegrationService.sendPush(recipient);

            return new ResponseEntity<>(
                    "Push was sent",
                    HttpStatus.OK
            );

        } catch (InnerPushSenderIntegrationException e) {
            return new ResponseEntity<>(
                    e.getMessage(),
                    HttpStatus.INTERNAL_SERVER_ERROR
            );
        }
    }
}
