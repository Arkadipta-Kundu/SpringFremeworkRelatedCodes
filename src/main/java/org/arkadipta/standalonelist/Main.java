package org.arkadipta.standalonelist;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context  = new ClassPathXmlApplicationContext("standAloneList.xml");
        Person person = (Person) context.getBean(Person.class);

        System.out.println(person);
    }
}
