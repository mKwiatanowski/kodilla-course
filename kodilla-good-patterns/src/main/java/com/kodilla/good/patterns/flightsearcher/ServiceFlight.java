package com.kodilla.good.patterns.flightsearcher;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ServiceFlight {

    private DataBase dataBase;

    public ServiceFlight(DataBase dataBase) {
        this.dataBase = dataBase;
    }

    public Set<Airport> availableFlightsFrom (String departureAirport){
        return dataBase.getFlightAvailable().stream()
                .filter(flight -> flight.getDepartureAirport().equals(departureAirport))
                .collect(Collectors.toSet());

    }

    public Set<Airport> availableFlightsTo (String arrivalAirport){
        return dataBase.getFlightAvailable().stream()
                .filter(flight -> flight.getArrivalAirport().equals(arrivalAirport))
                .collect(Collectors.toSet());

    }

    public Set<List<Airport>> availableConnectingFlights (String departureAirport, String arrivalAirport){
        return dataBase.getFlightAvailable().stream()
                .filter(flight -> flight.getDepartureAirport().equals(departureAirport))
                .map(flight -> createConnectionsList(flight, arrivalAirport))
                .filter(flight -> !flight.isEmpty())
                .collect(Collectors.toSet());

    }

    private List<Airport> createConnectionsList (Airport airport, String arrivalAirport){

        List<Airport> flightRoute = new ArrayList<>();

            dataBase.getFlightAvailable().stream()
                    .filter(transitionalFlight -> (airport.getArrivalAirport().equals(transitionalFlight.getDepartureAirport())) &&
                            transitionalFlight.getArrivalAirport().equals(arrivalAirport))
                    .findAny()
                    .ifPresent(nextFlight -> {
                        flightRoute.add(airport);
                        flightRoute.add(nextFlight);
                    });

        return flightRoute;
    }



}
