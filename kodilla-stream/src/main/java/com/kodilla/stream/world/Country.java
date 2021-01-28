package com.kodilla.stream.world;

import java.math.BigDecimal;

public final class Country {

    private final String country;
    private final BigDecimal peopleQuantity;


    public Country(final String country, final BigDecimal peopleQuantity) {
        this.country = country;
        this.peopleQuantity = peopleQuantity;
    }

    public String getCountry() {
        return country;
    }

    public BigDecimal getPeopleQuantity() {
        return peopleQuantity;
    }

}
