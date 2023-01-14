package com.glebgol.calculatorwebservice.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class MultiplyServiceImplTest {
    MultiplyService multiplyService;

    @BeforeEach
    public void setUp() {
        multiplyService = new MultiplyServiceImpl();
    }

    @Test
    public void multiplyPositiveNumbers() {
        double num1 = 12;
        double num2 = 4;
        double expectedResult = 48;

        double actualResult = multiplyService.multiply(num1, num2);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void multiplyNegativeNumbers() {
        double num1 = -12;
        double num2 = -4;
        double expectedResult = 48;

        double actualResult = multiplyService.multiply(num1, num2);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void multiplyNegativeNumberAndPositiveNumber() {
        double num1 = -4;
        double num2 = 3;
        double expectedResult = -12;

        double actualResult = multiplyService.multiply(num1, num2);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void multiplyByZero() {
        double num1 = 13;
        double num2 = 0;
        double expectedResult = 0;

        double actualResult = multiplyService.multiply(num1, num2);

        Assertions.assertEquals(expectedResult, actualResult);
    }
}