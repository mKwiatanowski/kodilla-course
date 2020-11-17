package com.kodilla.testing.collection;

import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.Arrays;

@DisplayName("List test")
public class CollectionTestSuite {

    @BeforeEach
    public void before(){
        System.out.println("Test Case: begin");

    }

    @AfterEach
    public void after(){
        System.out.println("Test Case: end");

    }

    @DisplayName("Checking the class when the list is empty")
    @Test
    public void testOddNumbersExterminatorEmptyList(){
        //Given
        ArrayList<Integer> emptyList = new ArrayList<Integer>();
        //When
        ArrayList<Integer> listNumbers = OddNumbersExterminator.exterminate(emptyList);
        System.out.println("Testing: " + listNumbers);
        //Then
        Assertions.assertEquals(emptyList, listNumbers);

    }

    @DisplayName("class checking when the list contains even and odd numbers")
    @Test
    public void testOddNumbersExterminatorNormalList(){
        //Given
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        ArrayList<Integer> oddList = new ArrayList<>(Arrays.asList(2,4,6,8,10));
        //When
        ArrayList<Integer> listNumbers = OddNumbersExterminator.exterminate(list);
        System.out.println("Testing: " + list);
        //Then
        Assertions.assertEquals(list, listNumbers);

    }
}
