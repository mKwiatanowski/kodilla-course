package com.kodilla.spring.portfolio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootTest
public class BoardTestSuite {

    @Test
    void testTaskAdd(){
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);

        //When
        String taskToDo = "Sample task to do";
        String taskInProgress = "Sample task in progress";
        String taskDone = "Sample task done";
        board.getToDoList().addTask(taskToDo);
        board.getInProgressList().addTask(taskInProgress);
        board.getDoneList().addTask(taskDone);

        //Then
        Assertions.assertEquals("Sample task to do", board.getToDoList().getTasks().get(0));
        Assertions.assertEquals("Sample task in progress", board.getInProgressList().getTasks().get(0));
        Assertions.assertEquals("Sample task done", board.getDoneList().getTasks().get(0));
    }


}
