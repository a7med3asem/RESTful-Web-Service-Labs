package com.ahmed.rest.exception;

import java.lang.*;

public class ResourceNotFoundException extends RuntimeException {
    public ResourceNotFoundException(String message) {
        super(message);
    }
}