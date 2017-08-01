package com.onlyisssilence.muya.impl;

import com.onlyisssilence.muya.service.HelloService;

/**
 * Author: MuYa
 * Date  : 2017/3/7
 * Description:
 */
public class HelloServiceImpl implements HelloService{
    public String sayHello() {

        System.out.println("hello dzk-service!");
        return "hello dzk-web";
    }
}
