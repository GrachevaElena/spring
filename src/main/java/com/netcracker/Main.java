package com.netcracker;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");

        Musician musician=(Musician) context.getBean("guitarPlayer");
        musician.play();

        musician=(Musician) context.getBean("guitarPlayer2");
        musician.play();
    }

}
