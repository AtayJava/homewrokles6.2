package com.company;

public class Main {

    public static void main(String[] args) {

        Family <Number> family = new Family<>();
        family.setPeople(5);
        System.out.println(family.getPeople());

        Family <Number> family2 = new Family<>();
        family2.setPeople(4);
        System.out.println(family2.getPeople());

    }
}
