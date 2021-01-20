package com.kodilla.good.patterns.food2Door.suppliers;

import com.kodilla.good.patterns.food2Door.Customer;
import com.kodilla.good.patterns.food2Door.Product;
import com.kodilla.good.patterns.food2Door.ProductFood;
import com.kodilla.good.patterns.food2Door.product.ProductMeat;
import com.kodilla.good.patterns.food2Door.product.ProductVegetables;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class HealthyShop implements ProductFood {

    private Map<Product, Integer> productList;
    private final String INACCASSIBLE = "Gluten Free Shot. We're sorry!, Product is inaccessible";

    public HealthyShop () {
        productList = productCreateList();
    }

    private Map<Product, Integer> productCreateList(){
        Map<Product, Integer> productList = new HashMap<>();

        productList.put(new ProductVegetables("Onion", true),13);
        productList.put(new ProductMeat("Chicken breast", "Light and BIO"),99);

        return productList;
    }

    @Override
    public boolean process(Customer costomer, Map<Product, Integer> order) {
        return false;
    }

    private boolean inStock (Map<Product, Integer> order){

        for (Map.Entry<Product, Integer> entry: order.entrySet()){
            Optional<Integer> productQuantity = Optional.ofNullable(productList.get(entry.getKey()));
            if (productQuantity.orElse(0) < entry.getValue()){
                System.out.println(INACCASSIBLE);
                return false;
            }
        }
        return true;
    }
}
