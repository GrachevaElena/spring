package com.netcracker;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");

        Orchestra orchestra= (Orchestra) context.getBean("orchestra");
        orchestra.getGuitarPlayer().play();
        orchestra.getViolinPlayer().play();
    }

}
