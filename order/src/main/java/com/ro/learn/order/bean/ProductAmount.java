package com.ro.learn.order.bean;

public class ProductAmount {
    private int productId;
    private double quantity;

    public ProductAmount() {
    }

    public ProductAmount(int productId, double quantity) {
        this.productId = productId;
        this.quantity = quantity;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }
}
