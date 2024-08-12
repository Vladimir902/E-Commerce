package com.java.oop.ecommerce.products;

public class Products {
    private int productId;
    private String productName;
    private double price;
    private String category;

    public Products(int productId, String productName, double price, String category) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
        this.category = category;
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

    public double getPrice(double gettingPrice) {
        gettingPrice = price;
        return gettingPrice;
    }
}


