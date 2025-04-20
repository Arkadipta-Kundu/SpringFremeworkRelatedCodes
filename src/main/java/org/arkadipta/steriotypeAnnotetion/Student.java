package org.arkadipta.steriotypeAnnotetion;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Student {
    @Value("Amar Pawar")
    private String name;
    @Value("69")
    private String roll;
    @Value("#{emails}")
    private List<String> emails;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRoll() {
        return roll;
    }

    public void setRoll(String roll) {
        this.roll = roll;
    }

    public List<String> getEmails() {
        return emails;
    }

    public void setEmails(List<String> emails) {
        this.emails = emails;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", roll='" + roll + '\'' +
                ", emails=" + emails +
                '}';
    }
}
