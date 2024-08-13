package com.java.oop.ecommerce.orders;

import java.util.ArrayList;
import java.util.List;

public class Orders implements OrderManager{
    private int orderId;
    private String customer;
    public List<String> products;
    private double totalCost;
    private String paymentMethod;

    public Orders(int orderId, String customer, List<String> products, double totalCost, String paymentMethod) {
        this.orderId = orderId;
        this.customer = customer;
        this.products = new ArrayList<>();
        this.totalCost = totalCost;
        this.paymentMethod = paymentMethod;
    }


    // Getters and Setters
    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public List<String> getProducts() {
        return products;
    }

    public void setProducts(List<String> products) {
        this.products = products;
    }

    public double getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(double totalCost) {
        this.totalCost = totalCost;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    // Method to place the order
    public void placeOrder() {
        System.out.println("Order placed successfully!");
    }

    @Override
    public void ordering() {
        System.out.println("ordering from Orders");
    }
}

