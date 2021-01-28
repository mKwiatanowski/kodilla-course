package com.kodilla.testing.mapa;

import java.util.LinkedList;
import java.util.List;

public class AddStudent {




    public void createListStudent(){


        List<Student> studentList = new LinkedList<Student>();
        studentList.add(new Student("Mateusz", "Kwiatanowski"));
        studentList.add(new Student("Kamil", "Rogal"));

        for(Student student: studentList){

            System.out.println(student.getFirstName() + " " + student.getLastName());
        }


    }

}
