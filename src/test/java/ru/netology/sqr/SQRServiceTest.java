package ru.netology.sqr;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SQRServiceTest {

    @ParameterizedTest
    @CsvSource(value = {"0, 0, 0",
            "100, 100, 1",
            "9_801, 9_801, 1",
            "10_000, 10_000, 0",
            "100, 300, 8",
            "200, 300, 3",
            "300, 200, 0"})
    void shouldReturnNumber(int bottomLimit, int topLimit, int expected) {
        SQRService sqrService = new SQRService();
        int actual = sqrService.sqrCounter(bottomLimit, topLimit);
        assertEquals(expected, actual);
    }
}