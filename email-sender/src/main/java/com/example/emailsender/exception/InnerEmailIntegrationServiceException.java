package com.example.emailsender.exception;

public class InnerEmailIntegrationServiceException extends RuntimeException {

    public InnerEmailIntegrationServiceException(String message) {
        super(message);
    }

    public InnerEmailIntegrationServiceException(String message, Throwable t) {
        super(message, t);
    }

}
