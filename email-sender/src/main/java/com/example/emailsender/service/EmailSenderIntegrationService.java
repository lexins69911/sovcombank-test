package com.example.emailsender.service;

import com.example.emailsender.exception.InnerEmailIntegrationServiceException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class EmailSenderIntegrationService {

//    Stub integration service

    public void sendEmail(String emailAddress, String firstName, String title, String message) throws InnerEmailIntegrationServiceException {
        log.info("email was sent");
    }

}
