package com.java.oop.ecommerce.payments;

import com.java.oop.ecommerce.orders.Orders;

public abstract class Payments {

    private int paymentId;
    private String order;
    private double amount;

    public Payments(int paymentId, String order, double amount) {
        this.paymentId = paymentId;
        this.order = order;
        this.amount = amount;
    }

    public abstract void processPayment();
    public void Payed() {
        System.out.println("Payed class");
    }
}
