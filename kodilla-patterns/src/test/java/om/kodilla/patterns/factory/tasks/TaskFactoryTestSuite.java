package om.kodilla.patterns.factory.tasks;

import com.kodilla.patterns.factory.tasks.Task;
import com.kodilla.patterns.factory.tasks.TaskFactory;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TaskFactoryTestSuite {

    @Test
    public void testFactoryDrivingTask() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task drivingTask = factory.makeTask(TaskFactory.DRIVINGTASK);
        boolean beforeExecution = drivingTask.isExecuted();
        drivingTask.executeTask();
        //Then
        Assertions.assertEquals("Delivery", drivingTask.getTaskName());
        Assertions.assertFalse(beforeExecution);
        Assertions.assertTrue(drivingTask.isExecuted());
    }

    @Test
    public void testFactoryShoppingTask() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task shoppingTask = factory.makeTask(TaskFactory.SHOPPINGTASK);
        boolean beforeExecution = shoppingTask.isExecuted();
        shoppingTask.executeTask();
        //Then
        Assertions.assertEquals("Shopping list", shoppingTask.getTaskName());
        Assertions.assertFalse(beforeExecution);
        Assertions.assertTrue(shoppingTask.isExecuted());
    }

    @Test
    public void testFactoryPaintingTask() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task paintingTask = factory.makeTask(TaskFactory.PAINTINGTASK);
        boolean beforeExecution = paintingTask.isExecuted();
        paintingTask.executeTask();
        //Then
        Assertions.assertEquals("Painting project", paintingTask.getTaskName());
        Assertions.assertFalse(beforeExecution);
        Assertions.assertTrue(paintingTask.isExecuted());
    }

    @Test
    public void testNullTask() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task nullTask = factory.makeTask("differentTask");
        //Then
        Assertions.assertNull(nullTask);
    }
}
