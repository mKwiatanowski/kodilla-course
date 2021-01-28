package com.kodilla.exception.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FlightSearchRunner {
    public static void main(String[] args) {

        Map<String, Boolean> dataBaseAirport = new HashMap<>();

        dataBaseAirport.put("WAR", true);
        dataBaseAirport.put("MAD", true);
        dataBaseAirport.put("TOR", false);
        dataBaseAirport.put("LON", false);

        FlightSearch flightSearch = new FlightSearch(dataBaseAirport);

        Flight warszawaLondyn = new Flight("WAR", "LON"); // t f
        Flight warszawaMadryt = new Flight("WAR", "MAD"); // t t
        Flight torontoMadryt = new Flight("TOR", "MAD"); // f t
        Flight londynToronto = new Flight("LON", "TOR"); //f f

        List<Flight> flightList = new ArrayList<>();
        flightList.add(warszawaLondyn);
        flightList.add(warszawaMadryt);
        flightList.add(torontoMadryt);
        flightList.add(londynToronto);

        for(Flight theFlight: flightList){

            try {
                boolean existFlight = flightSearch.findFlight(theFlight);
                System.out.println("Flight is possible from: " + theFlight.getDepartureAirport() + " to: " + theFlight.getArrivalAirport() + " : " + existFlight);
            } catch (RouteNotFoundException e) {
                System.out.println(e + "Select the correct airport name");
            }

        }

    }
}
