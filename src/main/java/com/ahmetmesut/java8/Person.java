package com.ahmetmesut.java8;

public class Person {

    private String name;

    private double age;

    public Person(String name,double age){
        this.name = name;
        this.age = age;
    }

    public double getAge() {
        return age;
    }

    public void setAge(double age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
