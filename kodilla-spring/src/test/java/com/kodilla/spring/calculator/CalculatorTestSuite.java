package com.kodilla.spring.calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootTest
public class CalculatorTestSuite {

    @Test
    public void testCalculations(){
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);

        //When
        double addResult = calculator.add(5, 7.5);
        double subResult = calculator.sub(21, 11);
        double mulResult = calculator.mul(4,9);
        double divResult = calculator.div(423, 12);

        //Then
        Assertions.assertEquals(12.5, addResult, 0.001);
        Assertions.assertEquals(10, subResult, 0.001);
        Assertions.assertEquals(36, mulResult, 0.001);
        Assertions.assertEquals(35.25, divResult, 0.001);
    }
}
