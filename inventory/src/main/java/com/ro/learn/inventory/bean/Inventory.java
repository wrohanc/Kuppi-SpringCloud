package com.ro.learn.inventory.bean;

public class Inventory {
    private int productId;
    private double amount;

    public Inventory(int productId, double amount) {
        this.productId = productId;
        this.amount = amount;
    }

    public void deduct(double quantity) {
        this.amount -= quantity;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
