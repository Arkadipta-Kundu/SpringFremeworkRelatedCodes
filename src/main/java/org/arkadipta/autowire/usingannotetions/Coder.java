package org.arkadipta.autowire.usingannotetions;

public class Coder {
    private Laptop laptop;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Laptop getLaptop() {
        return laptop;
    }

    public void setLaptop(Laptop laptop) {
        this.laptop = laptop;
    }

    @Override
    public String toString() {
        return "Coder{" +
                "laptop=" + laptop +
                ", name='" + name + '\'' +
                '}';
    }
}
