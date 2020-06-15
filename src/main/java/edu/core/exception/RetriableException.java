package edu.core.exception;

public class RetriableException extends Exception {

    public RetriableException(String message) {
        super(message);
    }

    public RetriableException(String message, Throwable cause) {
        super(message, cause);
    }
}
