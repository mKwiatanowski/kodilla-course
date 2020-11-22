package com.kodilla.testing.collection;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class StudentMarksTest {

    @Test
    public void testStudentMarks(){
        //Given
        Student student = new Student();
        student.addMark(2);
        student.addMark(3);
        //When
        double avg = student.calculateAvg();
        //Then
        Assertions.assertEquals(2.5, avg);
    }

    @Test
    public void testStudentMarksNull(){
        //Given
        Student student = new Student();
        //When
        double avg = student.calculateAvg();
        //Then
        Assertions.assertEquals(Double.NaN, avg);
    }

}
