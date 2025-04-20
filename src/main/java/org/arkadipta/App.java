package org.arkadipta;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main( String[] args ) {
//        System.out.println( "Hello World!" );
//        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        ApplicationContext context2 = new ClassPathXmlApplicationContext("samosaConfig.xml");
        System.out.println("Config loded");
//        Student s1 = (Student) context.getBean("student1");
//        System.out.println(s1);
        Samosa samosa = (Samosa) context2.getBean("samosa1");
        System.out.println(samosa);
    }

}
