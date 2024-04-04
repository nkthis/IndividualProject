package com.individual.project;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigApp {
    public static void main(String[] args) {
        
    
    AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        
    MessageService constructorService = context.getBean("messageServiceConstructor", MessageService.class);
    constructorService.printMessage();
    
    MessageService setterService = context.getBean("messageServiceSetter", MessageService.class);
    setterService.printMessage();
    
    context.close();
     
    }
}