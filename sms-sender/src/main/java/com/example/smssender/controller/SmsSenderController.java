package com.example.smssender.controller;

import com.example.smssender.exception.InnerSmsIntegrationServiceException;
import com.example.smssender.pojo.Recipient;
import com.example.smssender.service.SmsSenderIntegrationService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/sender/sms")
@RequiredArgsConstructor
public class SmsSenderController {

    private final SmsSenderIntegrationService smsSenderIntegrationService;

    @PostMapping("/send")
    public ResponseEntity<?> sendSms(@RequestBody Recipient recipient) {
        try {
            smsSenderIntegrationService.sendSms(recipient);

            return new ResponseEntity<>(
                    "Sms was sent",
                    HttpStatus.OK
            );

        } catch (InnerSmsIntegrationServiceException e) {
            return new ResponseEntity<>(
                    e.getMessage(),
                    HttpStatus.INTERNAL_SERVER_ERROR
            );
        }
    }
}
