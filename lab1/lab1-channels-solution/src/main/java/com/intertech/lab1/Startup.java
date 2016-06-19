package com.intertech.lab1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Startup {

    @SuppressWarnings({"resource", "unused"})
    // @SuppressWarnings({ "resource" })
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "/META-INF/spring/si-components.xml");

//        MessageChannel channel = context.getBean("messageChannel", MessageChannel.class);
//        Message<String> message1 = MessageBuilder.withPayload(
//                "Hello world - one!").build();
//        Message<String> message2 = MessageBuilder.withPayload(
//                "Hello world - two!").build();
//        Message<String> message3 = MessageBuilder.withPayload(
//                "Hello world - three!").build();
//        System.out.println("sending message1");
//        System.out.println("abc");
//        channel.send(message1);
//        System.out.println("sending message2");
//        channel.send(message2);
//        System.out.println("sending message3");
//        channel.send(message3);
//        System.out.println("done sending messages");

        while (true) {

        }
    }
}
