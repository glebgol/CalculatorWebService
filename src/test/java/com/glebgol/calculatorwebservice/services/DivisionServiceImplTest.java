package com.glebgol.calculatorwebservice.services;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DivisionServiceImplTest {
    DivisionService divisionService;

    @BeforeEach
    public void setUp() {
        divisionService = new DivisionServiceImpl();
    }

    @Test
    public void divideByZero() {
        double num1 = 13;
        double num2 = 0;

        Assertions.assertThrows(IllegalArgumentException.class, () -> divisionService.divide(num1, num2));
    }
    @Test

    public void dividePositiveNumbers() {
        double num1 = 12;
        double num2 = 4;
        double expectedResult = 3;

        double actualResult = divisionService.divide(num1, num2);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void divideNegativeNumbers() {
        double num1 = -12;
        double num2 = -4;
        double expectedResult = 3;

        double actualResult = divisionService.divide(num1, num2);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void divideNegativeNumberAndPositiveNumber() {
        double num1 = -43.2;
        double num2 = 3.6;
        double expectedResult = -12;

        double actualResult = divisionService.divide(num1, num2);

        Assertions.assertEquals(expectedResult, actualResult);
    }
}