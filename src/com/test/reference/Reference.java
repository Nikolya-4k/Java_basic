package com.test.reference;

import jdk.dynalink.beans.StaticClass;

public class Reference {

    public static void main(String[] args) {
        Person olga = new Person();

        olga.name = "Olga";
        olga.age = 10;

        Person inna = new Person();
        inna.name = "Olga";
        inna.age = 15;

        System.out.printf("Olga age +" + olga.age + ", Inna age is: " + inna.age);

        swapAge(olga, inna);

        System.out.printf("Olga age +" + olga.age + ", Inna age is: " + inna.age);

    }
        private static void swapAge(Person olga, Person inna) {
            int tempAge = olga.age;
            olga.age = inna.age;
            inna.age = tempAge;

        }

        static class Person {
            String name;
            int age;
        }

}
