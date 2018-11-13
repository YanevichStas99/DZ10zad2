package com.company;

import java.util.Random;

public class Person {
    private Name name;
    private SecondName secname;
    private int age;
    private int high;
    private int mass;
    private Random random=new Random();

    public Person(Name name, SecondName secname) {
        this.name = name;
        this.secname = secname;
    }

    public Person(Name name, SecondName secname,int age, int high) {
        this.name = name;
        this.secname = secname;
        this.age=age;
        this.high=high;
        this.mass=high-100+random.nextInt(10)-10;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name=" + name +
                ", secname=" + secname +
                ", age=" + age +
                ", high=" + high +
                ", mass=" + mass +
                '}';
    }
}
