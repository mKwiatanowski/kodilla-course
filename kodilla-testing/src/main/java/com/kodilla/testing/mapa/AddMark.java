package com.kodilla.testing.mapa;

import java.util.LinkedList;
import java.util.List;

public class AddMark {

     double sum = 0;
     double avg = 0;


    public void createListMark() {

        List<Mark> markList = new LinkedList<>();
        markList.add(new Mark(5.5, 2.5, 4.0));
        markList.add(new Mark(1.5, 5.0, 3.5));

        for(Mark mark: markList){

            sum = mark.getMarkChemistry() + mark.getMarkIt() + mark.getMarkMath();

            avg = sum / 3;

            System.out.println("Mark average: " + avg );

        }


    }

    }



