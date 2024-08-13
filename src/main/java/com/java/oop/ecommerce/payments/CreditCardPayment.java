package com.java.oop.ecommerce.payments;



public class CreditCardPayment extends Payments{

    public CreditCardPayment(int paymentId, String order, double amount) {
        super(paymentId, order, amount);
    }

    @Override
    public void processPayment() {
        System.out.println("Processing credit card payment.");
    }
}
