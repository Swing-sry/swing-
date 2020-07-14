package com.igeek.ch01.hello;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainTest {

    public static void main(String[] args) {

        //创建HelloWorld对象
        HelloWorld helloWorld = new HelloWorld();
        //赋值
        helloWorld.setUsername1("swing");
        //使用对象的方法
        helloWorld.work();
        System.out.println();
        System.out.println("Spring IOC");
        //创建IOC容器对象,立即创建容器中的bean实例及赋值
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        HelloWorld h = ac.getBean(HelloWorld.class);
        //使用bean
        h.work();
    }

}
