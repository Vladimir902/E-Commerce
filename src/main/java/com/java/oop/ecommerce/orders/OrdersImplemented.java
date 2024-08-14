package com.java.oop.ecommerce.orders;

public class OrdersImplemented implements OrderManager,IOrders {   //demonstrating multiple inheritance

    @Override
    public void ordering() {
        System.out.println("Ordering from OrdersImplemented");
    }

    @Override
    public void ordering2() {
        System.out.println("Ordering from IOrders");
    }
}
