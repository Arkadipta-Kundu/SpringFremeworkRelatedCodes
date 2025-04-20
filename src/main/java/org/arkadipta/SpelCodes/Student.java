package org.arkadipta.SpelCodes;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {
    //new object creation
    @Value("#{new java.lang.String ('Arkadipta Kundu')}")
    private String name;
    @Value("#{12*12}")
    private  int b;
    //using static methods
    @Value("#{T(java.lang.Math).sqrt(64)}")   // 8
    private int z;

    @Value("#{T(java.lang.Math).PI}") // assigns the value of pi
    private double pi_value;

    //using boolean values
    @Value("#{8>3}")
    private boolean isTrue;

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", b=" + b +
                ", z=" + z +
                ", pi_value=" + pi_value +
                ", isTrue=" + isTrue +
                '}';
    }

}
