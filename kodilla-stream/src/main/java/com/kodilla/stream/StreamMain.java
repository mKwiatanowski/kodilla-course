package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.beautifier.PoemDecorator;
import com.kodilla.stream.iterate.NumbersGenerator;
import com.kodilla.stream.lambda.*;
import com.kodilla.stream.reference.FunctionalCalculator;

import java.io.InputStream;
import java.io.OutputStream;

public class StreamMain {

     public static void main(String[] args) {
          System.out.println("Welcome to module 7 - Stream");

          Processor processor = new Processor();
          //Executor codeToExecute = () -> System.out.println("This is an example text."); // wyrażenie lambda
          //processor.execute(codeToExecute);

          processor.execute(() -> System.out.println("This is an example text."));


          ExpressionExecutor expressionExecutor = new ExpressionExecutor();

          System.out.println("Calculating expressions with lambdas");
          expressionExecutor.executeExpression(10, 5, (a, b) -> a + b);
          expressionExecutor.executeExpression(10, 5, (a, b) -> a - b);
          expressionExecutor.executeExpression(10, 5, (a, b) -> a * b);
          expressionExecutor.executeExpression(10, 5, (a, b) -> a / b);

          System.out.println("Calculating expressions with method references");
          expressionExecutor.executeExpression(3, 4, FunctionalCalculator::multiplyAByB);
          expressionExecutor.executeExpression(3, 4, FunctionalCalculator::addAToB);
          expressionExecutor.executeExpression(3, 4, FunctionalCalculator::subBFromA);
          expressionExecutor.executeExpression(3, 4, FunctionalCalculator::divideAByB);

          System.out.println("\nText improvement");
          PoemBeautifier poemBeautifier = new PoemBeautifier();
          poemBeautifier.beautify("Przykładowy tekst", String::toUpperCase);
          poemBeautifier.beautify("Przykładowy tekst", text -> "<<< " + text + " >>>");
          poemBeautifier.beautify("Przykładowy tekst", text -> {
               String result = "";
               for (char a : text.toCharArray()) {
                    result += a + " ";
               }
               return result;

          });

          poemBeautifier.beautify("Przykładowy tekst", text -> {
               String textPartOne=text.substring(0,12).toUpperCase();
               String textPartTwo = text.substring(12).toLowerCase();
               return textPartOne+textPartTwo;

          });

          System.out.println("Using Stream to generate even numbers from 1 to 20");
          NumbersGenerator.generateEven(20);



     }
}
