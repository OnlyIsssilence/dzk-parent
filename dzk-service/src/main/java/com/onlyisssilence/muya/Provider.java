package com.onlyisssilence.muya;


import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * Author: MuYa
 * Date  : 2017/3/6
 * Description:
 */
public class Provider {

    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"dubbo-provider.xml"});
        context.start();

    // 为保证服务一直开着，利用输入流的阻塞来模拟
        System.out.println("提供者服务已注册成功");
        try {
            System.in.read();//让此程序一直跑，表示一直提供服务
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


