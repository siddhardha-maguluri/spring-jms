package com.jms;

import com.jms.config.AppConfig;
import com.jms.producer.MessageSender;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class MessageProducerApp {
    public static void main(String[] args) {
        AbstractApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        MessageSender sender = context.getBean(MessageSender.class);
        sender.sendMessage("Hello World");
        System.out.println("Message sent to queue successfully");
        ((AbstractApplicationContext)context).close();
    }
}
