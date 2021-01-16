package com.kodilla.good.patterns.allegro;

public class MailService implements CustomerService {

    @Override
    public void inform(User user) {
        System.out.println("\n Thank You " + user.getNickName() + " for choosing our store. Your order has been processed.");
    }
}