package com.kodilla.good.patterns.food2Door;

import java.util.Map;

public class Order {

    private Customer customer;
    private ProductFood productFood;
    private Map<Product, Integer> productOrder;

    public Order(Customer customer, ProductFood productFood, Map<Product, Integer> productOrder) {
        this.customer = customer;
        this.productFood = productFood;
        this.productOrder = productOrder;
    }

    public Customer getCustomer() {
        return customer;
    }

    public ProductFood getProductFood() {
        return productFood;
    }

    public Map<Product, Integer> getProductOrder() {
        return productOrder;
    }
}
