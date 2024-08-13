package com.java.oop.ecommerce.products;

import java.util.Scanner;

public class Products {
    private int productId;
    private String productName;
    private double price;
    private String category;


    private double unitPrice;
    private double totalPrice;
    private int quantity;


    public Products(int productId, String productName, String category) {
        this.productId = productId;
        this.productName = productName;
        this.category = category;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
        calculateTotalPrice(); // Update the total price whenever quantity is set
    }

    // Setter for unit price
    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
        calculateTotalPrice(); // Update the total price whenever unit price is set
    }

    // Getter for quantity
    public int getQuantity() {
        return quantity;
    }

    // Getter for unit price
    public double getUnitPrice() {
        return unitPrice;
    }

    // Getter for total price
    public double getTotalPrice() {
        return totalPrice;
    }

    // Method to calculate the total price
    private void calculateTotalPrice() {
        this.totalPrice = this.quantity * this.unitPrice;
    }





    @Override
    public String toString() {
        return "Product{" +
                "productId=" + productId +
                ", productName='" + productName + '\'' +
                ", price=" + price +
                ", category='" + category + '\'' +
                '}';
    }


}


