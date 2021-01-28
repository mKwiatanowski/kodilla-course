package com.kodilla.good.patterns.food2Door.suppliers;

import com.kodilla.good.patterns.food2Door.Customer;
import com.kodilla.good.patterns.food2Door.Product;
import com.kodilla.good.patterns.food2Door.ProductFood;
import com.kodilla.good.patterns.food2Door.product.ProductMeat;
import com.kodilla.good.patterns.food2Door.product.ProductVegetables;

import java.util.HashMap;
import java.util.Map;

public class HealthyShop implements ProductFood {

    private Map<Product, Integer> products = new HashMap<>();

    public HealthyShop () {
        products = productCreateList();
    }

    private Map<Product, Integer> productCreateList(){

        products.put(new ProductVegetables("Onion", true),13);
        products.put(new ProductMeat("Chicken breast", "Light and BIO"),99);

        return products;
    }

    @Override
    public boolean process(Customer costomer, Map<Product, Integer> order) {
        return false;
    }


}
