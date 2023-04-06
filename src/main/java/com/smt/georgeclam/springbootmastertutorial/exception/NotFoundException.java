package com.smt.georgeclam.springbootmastertutorial.exception;

public class NotFoundException extends RuntimeException {
    public NotFoundException(String message) {
        super(message);
    }
}
