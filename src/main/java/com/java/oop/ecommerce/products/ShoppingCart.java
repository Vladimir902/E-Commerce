package com.java.oop.ecommerce.products;

import java.util.ArrayList;
import java.util.List;



public class ShoppingCart extends Products{

    private List<Products> items; // List to hold products


    public ShoppingCart(int productId, String productName, String category) {
        super(productId,productName,category);
        this.items = new ArrayList<>();

    }

    public void addProduct(Products product) {
        items.add(product);

    }

    public void removeProduct(Products productId) {
        items.remove(productId);
    }





}




