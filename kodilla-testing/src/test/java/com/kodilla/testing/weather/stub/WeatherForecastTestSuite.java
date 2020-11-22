package com.kodilla.testing.weather.stub;

import org.junit.jupiter.api.*;

@DisplayName("TDD weather test suite")
public class WeatherForecastTestSuite {

    private static int testCounter = 0;

    @BeforeAll
    public static void beforeAllTests() {

        System.out.println("This is the beginning of tests.");
    }

    @AfterAll
    public static void afterAllTests() {

        System.out.println("This test are finished.");
    }

    @BeforeEach
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @Nested
    @DisplayName("Test add and remove")
    class TestFigures {
        @Test
        void testCalculateForecastWithStub() {
            //Given
            Temperatures temperatures = new TemperaturesStub();
            WeatherForecast weatherForecast = new WeatherForecast(temperatures);

            //When
            int quantityOfSensors = weatherForecast.calculateForecast().size();

            //Then
            Assertions.assertEquals(5, quantityOfSensors);
        }
    }
        @Test
        void testAverateTemperatures() {
            //Given
            Temperatures temperatures = new TemperaturesStub();
            WeatherForecast weatherForecast = new WeatherForecast(temperatures);

            //When

            double testTemperatureAvg = weatherForecast.temperatureAvg();

            //Then
            Assertions.assertEquals(25.56, testTemperatureAvg);


        }
    @Test
    void testMedianTemperatures(){
        //Given
        Temperatures temperatures = new TemperaturesStub();
        WeatherForecast weatherForecast = new WeatherForecast(temperatures);

        //When

        double testTemperatureMedian = weatherForecast.temperatureMedian();
        //System.out.println(testTemperatureMedian);

        //Then
        Assertions.assertEquals(25.5, testTemperatureMedian);


    }
}
