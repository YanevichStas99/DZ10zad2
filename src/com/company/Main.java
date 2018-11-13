package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random random=new Random();


        Person[] persons=new Person[100];
        for (int i = 0; i <persons.length ; i++) {
            Name n=Name.values()[random.nextInt(Name.values().length)];
            SecondName sn=SecondName.values()[random.nextInt(SecondName.values().length)];
            persons[i]=new Person(n,sn,(random.nextInt(40)+20),random.nextInt(50)+150);
            System.out.println(persons[i]);

        }


    }
}
