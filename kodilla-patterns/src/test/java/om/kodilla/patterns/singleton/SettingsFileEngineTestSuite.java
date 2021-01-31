package om.kodilla.patterns.singleton;

import com.kodilla.patterns.singleton.SettingsFileEngine;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class SettingsFileEngineTestSuite {

    private static SettingsFileEngine settingsFileEngine;

    @BeforeAll
    public static void openSettingsFile(){
        settingsFileEngine = settingsFileEngine.INSTANCE;
        settingsFileEngine.open("myapp.settings");
    }

    @AfterAll
    public static void closeSettingsFile(){
        settingsFileEngine = settingsFileEngine.INSTANCE;
        settingsFileEngine.close();
    }

    @Test
    void testGetFileName(){
        //Given
        //When
        String fileName = settingsFileEngine.getFileName();
        System.out.println("Opened: " + fileName);
        //Then
        Assertions.assertEquals("myapp.settings", fileName);
    }

    @Test
    void testLoadSettings(){
        //Given
        //When
        boolean result = settingsFileEngine.loadSettings();
        //Then
        Assertions.assertTrue(result);
    }

    @Test
    void testSaveSettings(){
        //Given
        //When
        boolean result = settingsFileEngine.saveSettings();
        //Then
        Assertions.assertTrue(result);
    }
}
