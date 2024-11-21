package org.example.creational.tp;

public class Demo {
    public static void main(String[] args) {
        Configuration configuration = Configuration.getInstance();
        System.out.println(configuration.getData("host"));

    }
}
