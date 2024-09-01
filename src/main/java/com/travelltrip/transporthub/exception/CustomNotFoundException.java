package com.travelltrip.transporthub.exception;

public class CustomNotFoundException extends RuntimeException{
    private static final long serialVersionUID=1L;
    public CustomNotFoundException() {
    }
    public CustomNotFoundException(String message) {
        super(message);
    }
}
