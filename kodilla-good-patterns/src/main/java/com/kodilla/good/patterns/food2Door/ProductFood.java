package com.kodilla.good.patterns.food2Door;

import java.util.Map;

public interface ProductFood {

    boolean process (Customer customer, Map<Product, Integer> order);


}
