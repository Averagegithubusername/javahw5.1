package ru.netology.sqr;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {

    @Test
    void shouldReturnNumber() {
        SQRService SQRService = new SQRService();
        int bottomLimit = 100;
        int topLimit = 300;
        int expected = 8;
        int actual = SQRService.sqrCounter(bottomLimit, topLimit);
        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource(value = {"0, 0, 0",
            "100, 100, 1",
            "9_801, 9_801, 1",
            "10_000, 10_000, 0",
            "200, 300, 3",
            "300, 200, 0"})
     void shouldReturnNumber(int bottomLimit, int topLimit, int expected) {
        SQRService SQRService = new SQRService();
        int actual = SQRService.sqrCounter(bottomLimit, topLimit);
        assertEquals(expected, actual);
    }
}