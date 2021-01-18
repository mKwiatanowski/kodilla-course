package com.kodilla.good.patterns.foof2Door;

public abstract class Product {

    private String productName;

    protected Product(String productName) {
        this.productName = productName;
    }

    public String getProductName() {
        return productName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Product produck = (Product) o;

        return getProductName().equals(produck.getProductName());
    }

    @Override
    public int hashCode() {
        return getProductName().hashCode();
    }

    @Override
    public String toString() {
        return "Produck: " + productName;
    }
}
