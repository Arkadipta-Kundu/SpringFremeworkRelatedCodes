package org.arkadipta.lyfecycle.usingXML;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {
    public static void main(String[] args) {
        ApplicationContext context;
        try {
            context = new ClassPathXmlApplicationContext("samosaConfig.xml");
        } catch (BeansException e) {
            System.out.println("Not loded");
            throw new RuntimeException(e);
        }

        Samosa1 s1 = (Samosa1) context.getBean("samosa2");
        System.out.println(s1);
    }

}
