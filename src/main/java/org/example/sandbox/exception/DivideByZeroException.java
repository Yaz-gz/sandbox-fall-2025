package org.example.sandbox.exception;

public class DivideByZeroException extends Exception {

    public DivideByZeroException() {
    }

    public DivideByZeroException(String message) {
        super(message);
    }

    // Used for exception chaining
    public DivideByZeroException(String message, Throwable cause) {
        super(message, cause);
    }

    // Used for exception chaining
    public DivideByZeroException(Throwable cause) {
        super(cause);
    }
}
