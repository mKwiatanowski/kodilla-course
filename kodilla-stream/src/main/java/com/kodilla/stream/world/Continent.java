package com.kodilla.stream.world;

import java.util.ArrayList;
import java.util.List;

public final class Continent {

    private final String continent;
    private final List<Country> countryList = new ArrayList<>();

    public Continent(final String continent) {
        this.continent = continent;
    }

    public void addCountry(Country country){
        countryList.add(country);
    }

    public String getContinent() {
        return continent;
    }

    public List<Country> getCountryList() {
        return new ArrayList<>(countryList);
    }
}
