package org.example.app;

public class Order {
    private final String name;

    private final int number;


    public Order(int number, String name) {
        this.number = number;
        this.name = name;
    }

    public int getNumber(){
        return number;
    }

    public String getName(){
        return name;
    }

    @Override
    public String toString() {
        return number + " | " + name;
    }
}