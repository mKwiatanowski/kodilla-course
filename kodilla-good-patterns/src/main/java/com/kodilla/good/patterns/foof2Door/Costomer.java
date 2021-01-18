package com.kodilla.good.patterns.foof2Door;

public class Costomer {

    private String name;

    public Costomer(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Costomer costomer = (Costomer) o;

        return name.equals(costomer.name);
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }
}
