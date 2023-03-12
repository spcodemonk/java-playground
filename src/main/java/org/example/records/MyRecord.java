package org.example.records;

public class MyRecord {
    public static void main(String[] args) {

        Mamu m1 = new Mamu(100,"George");

        System.out.println(m1.name());
        System.out.println(m1.salary());
    }
}

 record Mamu(int salary, String name){}