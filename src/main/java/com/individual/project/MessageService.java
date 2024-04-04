package com.individual.project;

public class MessageService {
    
    private String message;

    public MessageService() {}

    public MessageService(String message) {
        this.message = message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void printMessage() {
        System.out.println("Your message: " + message);
    }
}
