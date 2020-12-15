package com.kodilla.testing.mapa;

import java.util.HashMap;
import java.util.Map;

public class App {

    public static void main(String[] args) {

        AddMark addMark = new AddMark();
        addMark.createListMark();

        AddStudent addStudent = new AddStudent();
        addStudent.createListStudent();

        Map <AddStudent, AddMark> studentMarks = new HashMap<>();
        studentMarks.put(addStudent, addMark);

        for(Map.Entry<AddStudent, AddMark> entry: studentMarks.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());

        }

    }

}














































/*
        AddStudent addStudent = new AddStudent();

        Student student1 = new Student("Kamil", "Rogal");
      //  Student student2 = new Student("Grzegorz", "Kowal");

      //  addStudent.createListStudent();


        AddMark addMark = new AddMark();

        //addMark.createListMark();

    //    addMark.createListMark();



        Map<Student, LinkedList<AddMark>> avgStudentMark = new HashMap<>();





        for(Map.Entry<Student, LinkedList<AddMark>> entry: avgStudentMark.entrySet()){



            Student key = entry.getKey();
            LinkedList<AddMark> value = entry.getValue();
            System.out.println(key + " " + value);

        }






        }

/*
        paramMap.put("segment", Lists.newArrayList("1"));
        paramMap.put("subDepartment", Lists.newArrayList("2"));
        paramMap.put("officerTitle", Lists.newArrayList("3"));
*/
/*


        Map<AddStudent, AddMark> avgStudentMark = new HashMap<>();

        avgStudentMark.put(addStudent, addMark);

        for (Map.Entry<AddStudent, AddMark> entry: avgStudentMark.entrySet()){

            System.out.println(entry.getKey() + "\n" + entry.getValue());
        }
*/
/*



        Map<AddStudent, List<Mark>> avgStudentMark = new HashMap<>();

        avgStudentMark.put(addStudent,addMark);

        for (Map.Entry<AddStudent, AddMark> entry: avgStudentMark.entrySet()){

            System.out.println("Student is: " + entry.getKey() + "\nMarks form subjects " + entry.getValue());


        }



*/







