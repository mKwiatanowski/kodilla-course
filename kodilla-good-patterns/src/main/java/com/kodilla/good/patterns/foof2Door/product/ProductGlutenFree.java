package com.kodilla.good.patterns.foof2Door.product;

import com.kodilla.good.patterns.foof2Door.Product;

public class ProductGlutenFree extends Product {

    private String Description;

    public ProductGlutenFree(String productName, String description) {
        super(productName);
        Description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        ProductGlutenFree that = (ProductGlutenFree) o;

        return Description.equals(that.Description);
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + Description.hashCode();
        return result;
    }
}

