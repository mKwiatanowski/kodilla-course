package com.kodilla.exception.test;

import com.kodilla.exception.io.FileReader;

import java.util.Map;

public class FlightSearch {

    private Map<String, Boolean> airportMap;

    public FlightSearch(Map<String, Boolean> airportMap) {
        this.airportMap = airportMap;
    }

    private boolean findAirport(String nameAirport) throws RouteNotFoundException{
        if(airportMap.containsKey(nameAirport)){
            return airportMap.get(nameAirport);
        } else {
            throw new RouteNotFoundException("Search airport: " + nameAirport + "does not be in ours base");
        }

    }

    public boolean findFlight(Flight flight) throws RouteNotFoundException{
        return findAirport(flight.getArrivalAirport()) && findAirport(flight.getDepartureAirport());

    }
}
