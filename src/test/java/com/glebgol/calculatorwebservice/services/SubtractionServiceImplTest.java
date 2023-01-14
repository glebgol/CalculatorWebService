package com.glebgol.calculatorwebservice.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class SubtractionServiceImplTest {
    SubtractionService subtractionService;
    @BeforeEach
    public void setUp() {
        subtractionService = new SubtractionServiceImpl();
    }

    @Test
    public void subtractPositiveNumbers() {
        double num1 = 12;
        double num2 = 13;
        double expectedResult = -1;

        double actualResult = subtractionService.subtract(num1, num2);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void subtractNegativeNumbers() {
        double num1 = -12;
        double num2 = -13;
        double expectedResult = 1;

        double actualResult = subtractionService.subtract(num1, num2);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void subtractNegativeNumberAndPositiveNumber() {
        double num1 = -12;
        double num2 = 13;
        double expectedResult = -25;

        double actualResult = subtractionService.subtract(num1, num2);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void subtractZero() {
        double num1 = 13;
        double num2 = 0;
        double expectedResult = 13;

        double actualResult = subtractionService.subtract(num1, num2);

        Assertions.assertEquals(expectedResult, actualResult);
    }
}