package com.kodilla.testing;
import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.user.SimpleUser;

public class TestingMain {

    public static void main(String[] args) {
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        System.out.println("Testing user Name");

        String result = simpleUser.getUserName();

        if (result.equals("theForumUser")) {
            System.out.println("test user name is OK");
        } else {
            System.out.println("Error!");
        }

        Calculator calculator = new Calculator();

        System.out.println("\nTesting calculator: add");

        int resultAdd = calculator.add(5,9);

        if(resultAdd == 5 + 9){
            System.out.println("Test add ok");

        } else {
            System.out.println("Error!");

        }

        System.out.println("\nTesting calculator: subtract");

        int resultSubtract = calculator.subtract(12,3);

        if(resultSubtract == 12 - 5){
            System.out.println("Test subtract ok");

        } else {
            System.out.println("Error!");

        }

    }

}