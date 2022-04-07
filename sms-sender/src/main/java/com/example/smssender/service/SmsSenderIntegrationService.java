package com.example.smssender.service;

import com.example.smssender.pojo.Recipient;
import com.example.smssender.exception.InnerSmsIntegrationServiceException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class SmsSenderIntegrationService {

//    Stub integration service

    public void sendSms(Recipient recipient) throws InnerSmsIntegrationServiceException {
        log.info("sms was sent");
    }

}
