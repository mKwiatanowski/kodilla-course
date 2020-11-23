package com.kodilla.testing.shape;

import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@DisplayName("TDD shape test suite")
public class ShapeCollectorTestSuite {

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
        public void testAddFigure() {
            //Given
            Circle circle = new Circle("Circle - 1", 5.5);
            Square square = new Square("Square - 1", 14.64);
            Triangle triangle = new Triangle("Triangle - 1", 55);

            ShapeCollector theList = new ShapeCollector(new ArrayList<Shape>(Arrays.asList(circle, square)));

            ShapeCollector expectedList = new ShapeCollector(new ArrayList<Shape>(Arrays.asList(circle, square, triangle)));

            int expectedListSize = expectedList.getShapeList().size();
            //when
            theList.addFigure(triangle);
            int realListSize = theList.getShapeList().size();
            //Then
            Assertions.assertEquals(expectedListSize, realListSize);
        }

        @Test
        public void testRemoveFigure() {
            //Given
            Circle circle = new Circle("Circle - 1", 5.5);
            Square square = new Square("Square - 1", 14.64);
            Triangle triangle = new Triangle("Triangle - 1", 55);

            ShapeCollector theList = new ShapeCollector(new ArrayList<Shape>(Arrays.asList(circle, square, triangle)));

            ShapeCollector expectedList = new ShapeCollector(new ArrayList<Shape>(Arrays.asList(circle, square)));

            int expectedListSize = expectedList.getShapeList().size();
            //when
            theList.removeFigure(triangle);
            int realListSize = theList.getShapeList().size();
            //Then
            Assertions.assertEquals(expectedListSize, realListSize);
        }

    }
    @Nested
    @DisplayName("Test get and show")
    class TestDisplay {
        @Test
        public void testGetFigure() {
            //Given
            Circle circle = new Circle("Circle - 1", 5.5);
            Square square = new Square("Square - 1", 14.64);
            Triangle triangle = new Triangle("Triangle - 1", 55);

          //  ShapeCollector theList = new ShapeCollector(new ArrayList<Shape>(Arrays.asList(circle, square, triangle)));
            ShapeCollector theList = new ShapeCollector(Arrays.asList(circle, square, triangle));

            //when
            Shape shape1 = theList.getFigure(0);
            Shape shape2 = theList.getFigure(-1);
            Shape shape3 = theList.getFigure(3);

            //Then
            Assertions.assertEquals(circle, shape1);
            Assertions.assertEquals(null, shape2);
            Assertions.assertEquals(null, shape3);

        }

        @Test
        public void testShowFigures() {
            //Given
            Circle circle = new Circle("Circle - 1", 5.5);
            Square square = new Square("Square - 1", 14.64);
            Triangle triangle = new Triangle("Triangle - 1", 55);

            List<Shape> theList = Arrays.asList(circle, square, triangle);

            //when
            ShapeCollector shapesCollection = new ShapeCollector(theList);
            //Then
            Assertions.assertEquals(theList, shapesCollection.showFigures());
        }
    }
}
