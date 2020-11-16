package com.kodilla.testing;
import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.user.SimpleUser;

public class TestingMain {

    public static void main(String[] args) {
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUserName();

        if (result.equals("theForumUser")) {
            System.out.println("test user name is OK");
        } else {
            System.out.println("Error!");
        }

        Calculator calculator = new Calculator(5,2);

        int resultAdd = calculator.add();
        int resultSubtract = calculator.subtract();

        if (resultAdd == calculator.getA() + calculator.getB()){

            System.out.println("Test add is ok");

        } else {

            System.out.println("Error");
        }

        if (resultSubtract == calculator.getA() - calculator.getB()){

            System.out.println("Test subtract is ok");

        } else {

            System.out.println("Error");

        }

    }

}