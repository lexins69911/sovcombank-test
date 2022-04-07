package com.example.smssender.exception;

public class InnerSmsIntegrationServiceException extends RuntimeException{

    public InnerSmsIntegrationServiceException(String message) {
        super(message);
    }

    public InnerSmsIntegrationServiceException(String message, Throwable t) {
        super(message, t);
    }
}
