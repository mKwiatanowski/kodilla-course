package com.kodilla.good.patterns.food2Door;

public class Customer {

    private String name;

    public Customer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Customer costomer = (Customer) o;

        return name.equals(costomer.name);
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }
}