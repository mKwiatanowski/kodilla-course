package com.kodilla.patterns2.decorator.pizza;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

public class PizzaOrderTestSuite {

    @Test
    public void testBasicPizzaOrderGetCost() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        //When
        BigDecimal calculatedCost = theOrder.getCost();
        //Then
        Assertions.assertEquals(new BigDecimal(15), calculatedCost);

    }

    @Test
    public void testBasicPizzaOrderGetDescription() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        //When
        String description = theOrder.getDescription();
        //Then
        Assertions.assertEquals("Your ordered pizza", description);
    }

    @Test
    public void testBasicPizzaOrderDeliveryGetCost() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new DeliveryDecorator(theOrder);
        //When
        BigDecimal calculatedCost = theOrder.getCost();
        //Then
        Assertions.assertEquals(new BigDecimal(20), calculatedCost);
    }

    @Test
    public void testBasicPizzaOrderDeliveryGetDescription() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new DeliveryDecorator(theOrder);
        //When
        String description = theOrder.getDescription();
        //Then
        Assertions.assertEquals("Your ordered pizza + delivery", description);
    }

    @Test
    public void testBasicPizzaOrderDoubleCheeseDriedTomatoesAndDeliveryGetCost() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new DoubleCheeseDecorator(theOrder);
        theOrder = new DriedTomatoesDecorator(theOrder);
        theOrder = new DeliveryDecorator(theOrder);
        //When
        BigDecimal calculatedCost = theOrder.getCost();
        //Then
        Assertions.assertEquals(new BigDecimal(25), calculatedCost);
    }

    @Test
    public void testBasicPizzaOrderDoubleCheeseDriedTomatoesAndDeliveryGetDescription() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new DoubleCheeseDecorator(theOrder);
        theOrder = new DriedTomatoesDecorator(theOrder);
        theOrder = new DeliveryDecorator(theOrder);
        //When
        String description = theOrder.getDescription();
        //Then
        Assertions.assertEquals("Your ordered pizza + double cheese + dried tomatoes + delivery", description);
    }
}
