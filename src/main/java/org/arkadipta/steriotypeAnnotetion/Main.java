package org.arkadipta.steriotypeAnnotetion;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("steriotypeannotetionconfig.xml");
        Student student = (Student) context.getBean("student", Student.class);

        System.out.println(student);
    }
}
