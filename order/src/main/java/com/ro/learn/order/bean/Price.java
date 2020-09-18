package com.ro.learn.order.bean;

public class Price {
    private int productId;
    private double price;

    public Price(int productId, double price) {
        this.productId = productId;
        this.price = price;
    }

    public int getProductId() {
        return productId;
    }

    public double getPrice() {
        return price;
    }
}
