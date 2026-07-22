package org.example;

import java.util.List;

public class Order {
    private String product;
    private Double cost;

    public Order(String product, double cost) {
        this.product = product;
        this.cost = cost;
    }

    public String getProduct() {
        return product;
    }

    public Double getCost() {
        return cost;
    }
}