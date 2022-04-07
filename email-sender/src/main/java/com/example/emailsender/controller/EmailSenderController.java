package com.example.emailsender.controller;

import com.example.emailsender.service.EmailSenderIntegrationService;
import com.example.emailsender.exception.InnerEmailIntegrationServiceException;
import com.example.emailsender.pojo.Recipient;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/sender/email")
@RequiredArgsConstructor
public class EmailSenderController {

    private final EmailSenderIntegrationService emailSenderIntegrationService;

    @PostMapping("/send")
    public ResponseEntity<String> sendEmail(@RequestBody Recipient recipinet) {

        try {
            emailSenderIntegrationService.sendEmail(recipinet.getEmailAddress(),
                    recipinet.getFirstName(), recipinet.getMessage().getTitle(), recipinet.getMessage().getMessageBody());

            return new ResponseEntity<>(
                    "Message was sent",
                    HttpStatus.OK
            );
        } catch (InnerEmailIntegrationServiceException e) {

            return new ResponseEntity<>(
                    e.getMessage(),
                    HttpStatus.INTERNAL_SERVER_ERROR
            );
        }
    }
}
