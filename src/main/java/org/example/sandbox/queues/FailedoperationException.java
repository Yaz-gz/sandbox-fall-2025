package org.example.sandbox.queues;

public class FailedoperationException extends RuntimeException {

    public FailedoperationException() {
    }

    public FailedoperationException(String message) {
        super(message);
    }

    public FailedoperationException(String message, Throwable cause) {
        super(message, cause);
    }

    public FailedoperationException(Throwable cause) {
        super(cause);
    }
}