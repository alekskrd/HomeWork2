package org.example;


import java.util.List;

public class Main {
    public static void main(String[] args) {


//        Person andrei = new Person("Andrei");

        Person ivan = new Person("Ivan");
        Person maria = new Person("Maria");

        Person oleg = new Person("Oleg");
        Person vika = new Person("Vika");

        Person lera = new Person("Lera");
        Person vasya = new Person("Vasya");

        Person karina = new Person("Karina");
        Person dima = new Person("Dima");

        System.out.println("genealogical tree for Andrei");

        TreeParents.getTreeParents(ivan, vika, lera, dima);
    }
}


