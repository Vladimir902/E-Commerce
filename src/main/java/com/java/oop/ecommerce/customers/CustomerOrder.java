package com.java.oop.ecommerce.customers;

public class CustomerOrder extends Customer{   //demonstrating inheritance

    private String category;
    private String relation;


    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getRelation() {
        return relation;
    }

    public void setRelation(String relation) {
        this.relation = relation;
    }


    public CustomerOrder(int customerId, String name, String email, String address,String category,String relation) {
        super(customerId, name, email, address);
        this.category = category;
        this.relation = relation;
    }






}
