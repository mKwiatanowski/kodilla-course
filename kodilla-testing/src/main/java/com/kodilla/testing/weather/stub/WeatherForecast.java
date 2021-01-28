package com.kodilla.testing.weather.stub;

import java.util.*;

public class WeatherForecast {

    private Temperatures temperatures;

    public WeatherForecast(Temperatures temperatures) {

        this.temperatures = temperatures;
    }

    public Map<String, Double> calculateForecast(){
        Map<String, Double> resultMap = new HashMap<>();

        for (Map.Entry<String, Double> temperature: temperatures.getTemperatures().entrySet()) {

            // adding 1 celsius degree to current value
            // as a temporary weather forecast
            resultMap.put(temperature.getKey(), temperature.getValue() + 1.0);
        }
        return  resultMap;

    }

    public double temperatureAvg (){
        
        Map<String ,Double> resultMap = new HashMap<>();

        double sum = 0;
        double avg;
        int counter = 0;

        for (Map.Entry<String, Double> entry: temperatures.getTemperatures().entrySet()) {

            sum += entry.getValue();
            counter ++;

        }

        avg = sum / counter;

        return avg;

    }

    public double temperatureMedian (){

        Map<String ,Double> resultMap = new HashMap<>();

        List<Double> med = new LinkedList<Double>();
        double median = 0;
        double medianAvg = 0;

        for (Map.Entry<String, Double> entry: temperatures.getTemperatures().entrySet()) {

            median = entry.getValue();
            med.add(median);

        }

        Collections.sort(med);

        if(med.size() % 2 == 0) {

            medianAvg = med.get(med.size()/2) + med.get(med.size()/2)-1;
            median = medianAvg / 2;

        } else {

            medianAvg = med.get(med.size()/2);

        }

        return median;

    }

}
