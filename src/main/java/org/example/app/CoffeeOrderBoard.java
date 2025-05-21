package org.example.app;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CoffeeOrderBoard {

    private static final Logger logger= LoggerFactory.getLogger(CoffeeOrderBoard.class);

    private final List<Order> orders = new ArrayList<>();
    private int nextOrderNumber = 1;


    public void add(String name){
        Order newOrder = new Order(nextOrderNumber, name);
                orders.add(newOrder);
        logger.info("Додане нове замовлення: {}", newOrder);
        nextOrderNumber++;
    }


    public void deliver(){
        if(orders.isEmpty()){
            logger.info("Order`s list is empty.");
            return;
        }
        Order order = orders.remove(0);
        logger.info("Order deliver: {}", order);
    }


    public void deliver(int orderNumber){
        Iterator<Order> iterator = orders.iterator();
        boolean found = false;
        while (iterator.hasNext()) {
            Order order = iterator.next();
            if (order.getNumber() == orderNumber) {
                iterator.remove();
                logger.info("Видано замовлення: {}", order);
                found = true;
                break;
            }
        }
        if (!found) {
            logger.error("Замовлення з номером {} не знайдено.", orderNumber);
        }

}

    public void draw() {
        System.out.println("Num | Name");
        for (Order order : orders) {
            System.out.println(order);
        }
    }
}
