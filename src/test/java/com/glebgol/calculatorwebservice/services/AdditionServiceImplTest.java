package com.glebgol.calculatorwebservice.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AdditionServiceImplTest {
    AdditionService additionService;

    @BeforeEach
    public void setUp() {
        additionService = new AdditionServiceImpl();
    }

    @Test
    public void addPositiveNumbers() {
        double num1 = 12;
        double num2 = 13;
        double expectedResult = 25;

        double actualResult = additionService.add(num1, num2);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void addNegativeNumbers() {
        double num1 = -12;
        double num2 = -13;
        double expectedResult = -25;

        double actualResult = additionService.add(num1, num2);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void addNegativeNumberAndPositiveNumber() {
        double num1 = -12;
        double num2 = 13;
        double expectedResult = 1;

        double actualResult = additionService.add(num1, num2);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void addZero() {
        double num1 = 13;
        double num2 = 0;
        double expectedResult = 13;

        double actualResult = additionService.add(num1, num2);

        Assertions.assertEquals(expectedResult, actualResult);
    }
}