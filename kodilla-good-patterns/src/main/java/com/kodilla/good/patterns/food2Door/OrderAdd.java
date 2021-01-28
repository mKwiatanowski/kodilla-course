package com.kodilla.good.patterns.food2Door;

import com.kodilla.good.patterns.food2Door.Customer;
import com.kodilla.good.patterns.food2Door.Order;
import com.kodilla.good.patterns.food2Door.Product;
import com.kodilla.good.patterns.food2Door.ProductFood;
import com.kodilla.good.patterns.food2Door.product.ProductGlutenFree;
import com.kodilla.good.patterns.food2Door.product.ProductMeat;
import com.kodilla.good.patterns.food2Door.product.ProductVegetables;
import com.kodilla.good.patterns.food2Door.suppliers.ExtraFoodShop;
import com.kodilla.good.patterns.food2Door.suppliers.GlutenFreeShop;
import com.kodilla.good.patterns.food2Door.suppliers.HealthyShop;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OrderAdd {

    public List<Order> orderAdd(){
        List<Order> orderAddList = new ArrayList<>();

        Customer customer1 = new Customer("Adam");
        ProductFood productFood1 = new GlutenFreeShop();
        Map<Product, Integer> productList1 = new HashMap<>();
        productList1.put(new ProductGlutenFree("Cookies", "Cookies with nut"), 3);
        orderAddList.add(new Order(customer1,productFood1,productList1));

        Customer customer2 = new Customer("Kasia");
        ProductFood productFood2 = new ExtraFoodShop();
        Map<Product, Integer> productList2 = new HashMap<>();
        productList2.put(new ProductVegetables("Potato", true),7);
        productList2.put(new ProductGlutenFree("Rise", "Brawn and long"),47);
        orderAddList.add(new Order(customer2, productFood2, productList2));

        Customer customer3 = new Customer("Rudi");
        ProductFood productFood3 = new HealthyShop();
        Map<Product, Integer> productList3 = new HashMap<>();
        productList3.put(new ProductVegetables("Onion", true),3);
        productList3.put(new ProductMeat("Chicken breast", "Light and BIO"),1);
        orderAddList.add(new Order(customer3, productFood3, productList3));

        return orderAddList;
    }
}
