package com.exceptions.demo;

public class CustomException extends RuntimeException{
    public CustomException(String message) {
        super(message);
    }
}
