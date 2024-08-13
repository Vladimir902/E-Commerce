package com.java.oop.ecommerce.payments;



public class PayPalPayment extends Payments {

    public PayPalPayment(int paymentId, String order, double amount) {
        super(paymentId, order, amount);
    }

    @Override
    public void processPayment() {
        System.out.println("Processing PayPal payment.");
    }
}
