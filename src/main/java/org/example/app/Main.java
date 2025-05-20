package org.example.app;

public class Main {
    public static void main(String[] args) {
        CoffeeOrderBoard c =new CoffeeOrderBoard();
        c.add("Nika");
        c.add("Kira");
        c.add("Vova");
        c.add("Misha");
        c.add("Kolya");
        c.draw();
        c.deliver(3);
        c.deliver();
        c.draw();
    }
}
