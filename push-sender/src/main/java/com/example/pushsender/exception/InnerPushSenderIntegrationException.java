package com.example.pushsender.exception;

public class InnerPushSenderIntegrationException extends RuntimeException{

    public InnerPushSenderIntegrationException(String message) {
        super(message);
    }

    public InnerPushSenderIntegrationException(String message, Throwable t) {
        super(message, t);
    }
}
