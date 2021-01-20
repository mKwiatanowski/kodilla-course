package com.kodilla.good.patterns.food2Door.suppliers;

import com.kodilla.good.patterns.food2Door.Product;
import com.kodilla.good.patterns.food2Door.Customer;
import com.kodilla.good.patterns.food2Door.ProductFood;
import com.kodilla.good.patterns.food2Door.product.ProductGlutenFree;
import com.kodilla.good.patterns.food2Door.product.ProductVegetables;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class ExtraFoodShop implements ProductFood {

    private Map<Product, Integer> productList;
    private final String INACCASSIBLE = "Gluten Free Shot. We're sorry!, Product is inaccessible";


    public ExtraFoodShop(){
        productList = productCreateList();
    }

    private Map<Product, Integer> productCreateList(){
        Map<Product, Integer> productList = new HashMap<>();

        productList.put(new ProductVegetables("Potato", true),34);
        productList.put(new ProductGlutenFree("Rise", "Brawn and long"),554);

        return productList;

    }

    @Override
    public boolean process(Customer costomer, Map<Product, Integer> order) {

        return inStock(order);
    }

    private boolean inStock(Map<Product, Integer> order){

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
