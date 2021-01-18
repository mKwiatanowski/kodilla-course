package com.kodilla.good.patterns.foof2Door.product;

import com.kodilla.good.patterns.foof2Door.Product;

public class ProductVegetables extends Product {

    private boolean isModifiedGMO;

    public ProductVegetables(String productName, boolean isModifiedGMO) {
        super(productName);
        this.isModifiedGMO = isModifiedGMO;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        ProductVegetables that = (ProductVegetables) o;

        return isModifiedGMO == that.isModifiedGMO;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (isModifiedGMO ? 1 : 0);
        return result;
    }
}
