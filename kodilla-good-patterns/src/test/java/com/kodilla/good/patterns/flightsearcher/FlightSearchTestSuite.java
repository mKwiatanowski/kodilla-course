package com.kodilla.good.patterns.flightsearcher;


import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class FlightSearchTestSuite {

    private static ServiceFlight serviceFlight;
    private static DataBase dataBaseMock;
    private static Set<Airport> availableFlight;

    @BeforeClass
    public static void beforeClass(){
        dataBaseMock = mock(DataBase.class);
        serviceFlight = new ServiceFlight(dataBaseMock);

        availableFlight = new HashSet<>();
        availableFlight.add(new Airport("KRA", "RZE"));
        availableFlight.add(new Airport("GDA", "WAR"));
        availableFlight.add(new Airport("KRA", "LUB"));
        availableFlight.add(new Airport("SZC", "KAT"));
        availableFlight.add(new Airport("KAT", "RZE"));
        availableFlight.add(new Airport("WAR", "WRO"));
        availableFlight.add(new Airport("WRO", "POZ"));
        availableFlight.add(new Airport("WRO", "GDA"));
        availableFlight.add(new Airport("KRA", "WRO"));
        availableFlight.add(new Airport("SZC", "KRA"));
    }

    @Test
    public void availableFlightsFromTest(){
        //Given
        String airportDeparture = "KRA";
        Set<Airport> expected = new HashSet<>();
        expected.add(new Airport("KRA", "RZE"));
        expected.add(new Airport("KRA", "LUB"));
        expected.add(new Airport("KRA", "WRO"));

        //When
        when(dataBaseMock.getFlightAvailable()).thenReturn(availableFlight);
        Set<Airport> result = serviceFlight.availableFlightsFrom(airportDeparture);

        //Then
        Assert.assertEquals(expected, result);

    }

    @Test
    public void notAvailableFlightsFromTest(){
        //Given
        String airportDeparture = "LUB";
        Set<Airport> expected = new HashSet<>();
        //When
        when(dataBaseMock.getFlightAvailable()).thenReturn(availableFlight);
        Set<Airport> result = serviceFlight.availableFlightsFrom(airportDeparture);

        //Then
        Assert.assertEquals(expected, result);

    }

    @Test
    public void availableFlightsToTest(){
        //Given
        String airportDeparture = "WAR";
        Set<Airport> expected = new HashSet<>();
        expected.add(new Airport("GDA", "WAR"));

        //When
        when(dataBaseMock.getFlightAvailable()).thenReturn(availableFlight);
        Set<Airport> result = serviceFlight.availableFlightsTo(airportDeparture);

        //Then
        Assert.assertEquals(expected, result);
    }

    @Test
    public void notAvailableFlightsToTest(){
        //Given
        String airportDeparture = "SZC";
        Set<Airport> expected = new HashSet<>();

        //When
        when(dataBaseMock.getFlightAvailable()).thenReturn(availableFlight);
        Set<Airport> result = serviceFlight.availableFlightsTo(airportDeparture);

        //Then
        Assert.assertEquals(expected, result);
    }

    @Test
    public void availableConnectingFlightsTest(){
        //Given
        String departureAirport = "KRA";
        String arrivalAirport = "POZ";
        Set<List<Airport>> expected = new HashSet<>();
        List<Airport> kraWroWroPoz = new ArrayList<>();
        kraWroWroPoz.add(new Airport("KRA", "WRO"));
        kraWroWroPoz.add(new Airport("WRO", "POZ"));

        expected.add(kraWroWroPoz);

        //When
        when(dataBaseMock.getFlightAvailable()).thenReturn(availableFlight);
        Set<List<Airport>> result = serviceFlight.availableConnectingFlights(departureAirport, arrivalAirport);

        //Then
        Assert.assertEquals(expected, result);

    }

    @Test
    public void notAvailableConnectingFlightsTest(){
        //Given
        String departureAirport = "KRA";
        String arrivalAirport = "SZC";
        Set<List<Airport>> expected = new HashSet<>();

        //When
        when(dataBaseMock.getFlightAvailable()).thenReturn(availableFlight);
        Set<List<Airport>> result = serviceFlight.availableConnectingFlights(departureAirport, arrivalAirport);

        //Then
        Assert.assertEquals(expected, result);

    }



}
