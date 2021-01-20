package com.kodilla.good.patterns.food2Door;

public class App {

    public static void main(String[] args){

        OrderService orderService = new OrderService();
        orderService.processOrders(new OrderAdd().orderAdd());

    }
}
