package com.kodilla.testing.collection;

import java.util.ArrayList;
import java.util.List;

public class Student {

    private List<Integer> marks = new ArrayList<>();

    public void addMark(Integer mark){
        marks.add(mark);

    }

    public double calculateAvg(){

        int sum = 0;

        for(int i=0; i < marks.size(); i++){

            sum += marks.get(i);


        }

        double avg = sum / (double) marks.size();
        return avg;

    }




}
