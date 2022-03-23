package com.AgendaSpring.AgendaSpring.exeption;

public class BadRequestExeption extends RuntimeException {
    public BadRequestExeption(String message) {
        super(message);
    }
}
