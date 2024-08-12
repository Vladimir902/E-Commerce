package com.java.oop.ecommerce.products;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

    private List<Products> items; // List to hold products
    private double totalCost;
    double inputOfPrice;

    public ShoppingCart() {
        this.items = new ArrayList<>();
        this.totalCost = 0.0;
    }

    public void addProduct(Products product) {
        items.add(product);

    }

    public void removeProduct(Products productId) {
        items.remove(productId);
    }

        private void calculateTotalCost() {
            totalCost = 0.0; // Reset the total cost to 0
            for (Products product : items) {
                totalCost = totalCost + product.getPrice(inputOfPrice); // Add each product's price to totalCost
            }
        }

    }



