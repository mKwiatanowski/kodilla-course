package com.kodilla.exception.io;

import com.kodilla.exception.test.ExceptionHandling;
import com.kodilla.exception.test.SecondChallenge;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FileReaderTestSuite {


    @Test
    void testReadFile() {
        // given
        FileReader fileReader = new FileReader();
        // when & then
        assertDoesNotThrow(() -> fileReader.readFile());
    }

    @Test
    void whenFileDosentExistsReadFileShouldThrowException() {
        // given
        FileReader fileReader = new FileReader();
        String fileName = "nie_ma_takiego_pliku.txt";
        // when & then
        assertThrows(FileReaderException.class, () -> fileReader.readFile(fileName));
    }

    @Test
    void testReadFileWithName() {
        // given
        FileReader fileReader = new FileReader();
        // when & then
        assertAll(
                () -> assertThrows(FileReaderException.class, () -> fileReader.readFile("nie_ma_takiego_pliku.txt")),
                () -> assertThrows(FileReaderException.class, () -> fileReader.readFile(null)),
                () -> assertDoesNotThrow(() -> fileReader.readFile("names.txt"))
        );
    }

    @Test
    void testBoundaryConditionOne(){
        //given
        SecondChallenge secondChallenge = new SecondChallenge();

        //when
        assertAll(
                () -> assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(0.0, 0.0)),
                () -> assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(2, 0.0)),
                () -> assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(0.999, 0.0)),
                () -> assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(0.999, 1.4999)),
                () -> assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(0.999, 1.5001)),
                () -> assertEquals("Done!", secondChallenge.probablyIWillThrowException(1.0, 7)),
                () -> assertEquals("Done!", secondChallenge.probablyIWillThrowException(1.999, 7)),
                () -> assertEquals("Done!", secondChallenge.probablyIWillThrowException(1.5, 7))
        );

    }


}
