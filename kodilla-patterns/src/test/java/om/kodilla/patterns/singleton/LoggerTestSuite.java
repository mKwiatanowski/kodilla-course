package om.kodilla.patterns.singleton;

import com.kodilla.patterns.singleton.Logger;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class LoggerTestSuite {

    @BeforeAll
    public static void writtenToLogs(){
        Logger.getInstance().log("Simple test log");
    }

    @Test
    void testGetLastLog(){
        //Given
        //When
        String lastLog = Logger.getInstance().getLastLog();
        //Then
        Assertions.assertEquals("Simple test log", lastLog);
    }

    @Test
    void testGetInstance(){
        //Given
        //When
        Logger instance1 = Logger.getInstance();
        instance1.log("log1");
        Logger instance2 = Logger.getInstance();
        instance2.log("log2");

        String lastLogOfInstance1 = instance1.getLastLog();
        String lastLogOfInstance2 = instance2.getLastLog();
        String lastLog = Logger.getInstance().getLastLog();

        //Then
        Assertions.assertEquals(instance1, instance2);
        Assertions.assertEquals(lastLogOfInstance1, lastLogOfInstance2);
        Assertions.assertEquals(lastLog, "log2");
    }
}
