package com.onlyisssilence.muya.service;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * Author: MuYa
 * Date  : 2017/3/6
 * Description:
 */
public class ConsumerServiceTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                new String[] {"dubbo-consumer.xml"});
        context.start();
        HelloService helloService = (HelloService) context.getBean("helloService");
        System.out.println(helloService.sayHello());
        try {
            System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
