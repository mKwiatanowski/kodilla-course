package com.kodilla.good.patterns.food2Door;

import java.util.List;

public class OrderService {

    private final String PROCESS = "We're processing your order now. Thanks for choosing our services ";
    private final String STATUS = " Order success status: ";

    public void processOrders(List<Order> orders) {
        orders.stream()
                .map(order -> {
                    System.out.println(PROCESS + order.getCustomer().getName());
                    return order.getProductFood().process(order.getCustomer(), order.getProductOrder());
                })
                .forEach(status -> System.out.println(STATUS + status));
    }
}
