package com.kodilla.stream.world;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.math.BigDecimal;


public class WorldTestSuite {

    @Test
    public void testGetPeopleQuantity(){
        //Given
        Country poland = new Country("Poland", new BigDecimal(38000000L));
        Country germany = new Country("Germany", new BigDecimal(65000000L) );
        Country spain = new Country("Spain", new BigDecimal(40500000L));
        Country uk = new Country("UK", new BigDecimal(60600000L));
        Country china = new Country("China", new BigDecimal(1314500000L));
        Country india = new Country("India", new BigDecimal(1095350000L));
        Country japan = new Country("Japan", new BigDecimal(12740000L));
        Country vietnam = new Country("Vietnam", new BigDecimal(85400000L));
        Country usa = new Country("USA", new BigDecimal(289400000L));
        Country brazil = new Country("Brazil", new BigDecimal(188000000L));
        Country mexico = new Country("Mexico", new BigDecimal(107500000L));
        Country argentina = new Country("Argentina", new BigDecimal(39500000L));

        Continent europe = new Continent("Europe");
        Continent asia = new Continent("Asia");
        Continent america = new Continent("America");

        europe.addCountry(poland);
        europe.addCountry(germany);
        europe.addCountry(spain);
        europe.addCountry(uk);
        asia.addCountry(china);
        asia.addCountry(india);
        asia.addCountry(japan);
        asia.addCountry(vietnam);
        america.addCountry(usa);
        america.addCountry(brazil);
        america.addCountry(mexico);
        america.addCountry(argentina);

        World world = new World();
        world.addContinent(europe);
        world.addContinent(asia);
        world.addContinent(america);

        //When
        BigDecimal total = world.getPeopleQuantity();

        //Then
        Assertions.assertEquals(3336490000L, total);

    }
}
