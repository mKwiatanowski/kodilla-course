package com.kodilla.hibernate.tasklist.dao;

import com.kodilla.hibernate.tasklist.TaskList;
//import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class TaskListDaoTestSuite {

    @Autowired
    private TaskListDao taskListDao;

    @Test
    void TaskListDaoTestSuite(){
        //Given
        TaskList taskList = new TaskList("Simple name", "Simple description");

        //When
        taskListDao.save(taskList);
        String listName = taskList.getListName();

        //Then
        int id = taskList.getId();
        List<TaskList> read = taskListDao.findByListName(listName);
        Assertions.assertEquals(1, read.size());

        //CleanUp
        taskListDao.deleteById(id);

    }


}
