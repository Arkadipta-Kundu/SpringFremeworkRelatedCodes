package org.arkadipta;

public class Student {
    private int sid;
    private String name;
    private String address;

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        System.out.println("Setting sid");
        this.sid = sid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        System.out.println("Setting name");
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        System.out.println("Setting address");
        this.address = address;
    }
    @Override
    public String toString() {
        return "Student{" +
                "sid=" + sid +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    public Student(int sid, String name, String address) {
        this.sid = sid;
        this.name = name;
        this.address = address;
    }

    public Student() {
        super();
    }
}
