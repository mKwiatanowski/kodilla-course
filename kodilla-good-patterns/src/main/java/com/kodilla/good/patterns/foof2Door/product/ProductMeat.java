package com.kodilla.good.patterns.foof2Door.product;

import com.kodilla.good.patterns.foof2Door.Product;

public class ProductMeat extends Product {

    private String mateType;

    public ProductMeat(String productName, String mateType) {
        super(productName);
        this.mateType = mateType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        ProductMeat that = (ProductMeat) o;

        return mateType.equals(that.mateType);
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + mateType.hashCode();
        return result;
    }
}
