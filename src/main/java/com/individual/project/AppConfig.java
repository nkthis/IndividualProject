package com.individual.project;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
     

     // Constructor Injection
    @Bean
    public MessageService messageServiceConstructor() {
        return new MessageService("Hello from Constructor Injection!");
    }

    // Setter Injection
    @Bean
    public MessageService messageServiceSetter() {
        MessageService service = new MessageService();
        service.setMessage("Hello from Setter Injection!");
        return service;
    }
}
