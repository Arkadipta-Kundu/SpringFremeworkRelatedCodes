package org.arkadipta.autowire.usingxml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("autowire.xml");
        Coder c1 = (Coder) context.getBean("coder1");


        System.out.println(c1);
    }
}
