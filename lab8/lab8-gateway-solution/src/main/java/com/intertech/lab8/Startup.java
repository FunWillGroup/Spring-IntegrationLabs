package com.intertech.lab8;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class Startup {

    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "/META-INF/spring/si-components.xml");

//		 MessageChannel channel = context.getBean("requestChannel",
//		 MessageChannel.class);
//		 Message<String> message =
//		 MessageBuilder.withPayload("Hello brave new world").build();
//		 channel.send(message);

		/**/
        PigLatinService service = context.getBean("latinService",
                PigLatinService.class);

        //String synServiceOut = service.translate("Hello brave new world");
        Future<String> future = service.translate("Hello brave new world");


        //Do some heavy work here
        System.out.println("Do some heavy work here");

        String asynServiceOutput = future.get(5000, TimeUnit.SECONDS);

        //System.out.println(synServiceOut);

        System.out.println(asynServiceOutput);

        context.close();
    }
}
