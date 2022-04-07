package com.example.pushsender.service;

import com.example.pushsender.pojo.Recipient;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class PushSenderIntegrationService {

//    Stub integration service

    public void sendPush(Recipient recipient) {
        log.info("push was sent");
    }
}
