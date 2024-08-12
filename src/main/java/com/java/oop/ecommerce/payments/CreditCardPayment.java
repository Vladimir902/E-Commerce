package com.java.oop.ecommerce.payments;

import com.java.oop.ecommerce.orders.Orders;

public class CreditCardPayment extends Payments{

    public CreditCardPayment(int paymentId, String order, double amount) {
        super(paymentId, order, amount);
    }

    @Override
    public void processPayment() {
        System.out.println("Processing credit card payment.");
    }
}
