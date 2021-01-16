package com.kodilla.good.patterns.allegro;

import java.time.LocalDateTime;

public class ProductOrderRequestRetriever {

    public ProductOrderRequest retrieve() {
        User user = new User("Mareczek85", "Marek", "Kowalski");
        LocalDateTime orderDate = LocalDateTime.of(2021, 1, 5, 12, 56);
        Product product = new Game("Cyberpunk2077","Action game", 199.00);
        int quantity = 1;

        System.out.println("\n Download a product request");
        System.out.println("User: " + user.getNickName() + "\n Sale date: " + orderDate +
                "\n" + product + "\n  Quantity: " + quantity);
        return new ProductOrderRequest(user, orderDate, product, quantity);
    }
}
