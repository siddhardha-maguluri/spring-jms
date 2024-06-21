package com.jms;

import com.jms.config.AppConfig;
import com.jms.receiver.MessageReceiver;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class MessageConsumerApp {
    public static void main(String[] args) {
        AbstractApplicationContext context = new AnnotationConfigApplicationContext(
                AppConfig.class);

        MessageReceiver messageReceiver = (MessageReceiver) context.getBean(MessageReceiver.class);
        String response = messageReceiver.receiveMessage();
        System.out.println("Message Received = " + response);
        ((AbstractApplicationContext) context).close();
    }
}
