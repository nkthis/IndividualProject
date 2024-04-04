package com.individual.project;

import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App {


  public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        MessageService service = context.getBean("messageService", MessageService.class);
        service.printMessage();
        context.close();
    }
}
