package com.java.oop.ecommerce.products;

import java.util.ArrayList;
import java.util.List;

public class Products {
    private int productId;
    private String productName;
    private double price;
    private String category;

    private List<Double> productPrices;
    private double totalPrice;


    public Products(int productId, String productName, String category) {
        this.productId = productId;
        this.productName = productName;
        this.category = category;
        this.productPrices = new ArrayList<>();
        this.totalPrice = 0.0;
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



    // Method to add a product price
    public void addProductPrice(double price) {
        this.productPrices.add(price);
        calculateTotalPrice(); // Update the total price whenever a new price is added
    }

    // Getter for product prices
    public List<Double> getProductPrices() {
        return productPrices;
    }

    // Getter for total price
    public double getTotalPrice() {
        return totalPrice;
    }

    // Method to calculate the total price by summing up the prices of all products
    private void calculateTotalPrice() {
        this.totalPrice = 0.0;
        for (double price : productPrices) {
            this.totalPrice += price;
        }
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


