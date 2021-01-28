package com.kodilla.good.patterns.flightsearcher;

import java.util.Set;

public class DataBase {

    private Set<Airport> flightAvailable;

    public DataBase(Set<Airport> flightAvailable) {
        this.flightAvailable = flightAvailable;
    }

    public Set<Airport> getFlightAvailable() {
        return flightAvailable;
    }
}
