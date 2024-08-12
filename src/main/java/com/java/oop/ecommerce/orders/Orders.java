package com.java.oop.ecommerce.orders;

import com.java.oop.ecommerce.customers.Customer;
import com.java.oop.ecommerce.products.Products;

import java.util.Date;
import java.util.List;

public class Orders {

    private int orderId;
    private Customer customer;
    private Date orderDate;

    public Orders(int orderId, Customer customer, Date orderDate) {
        this.orderId = orderId;
        this.customer = customer;
        this.orderDate = orderDate;
    }
}
