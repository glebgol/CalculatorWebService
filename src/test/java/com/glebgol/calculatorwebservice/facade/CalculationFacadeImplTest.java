package com.glebgol.calculatorwebservice.facade;

import com.glebgol.calculatorwebservice.services.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class CalculationFacadeImplTest {
    CalculationFacade calculationFacade;
    AdditionService additionService;
    DivisionService divisionService;
    MultiplyService multiplyService;
    SubtractionService subtractionService;
    @BeforeEach
    public void setUp() {
        additionService = new AdditionServiceImpl();
        divisionService = new DivisionServiceImpl();
        multiplyService = new MultiplyServiceImpl();
        subtractionService = new SubtractionServiceImpl();
        calculationFacade = new CalculationFacadeImpl(additionService, divisionService, multiplyService, subtractionService);
    }

    @Test
    void add() {
        double num1 = 12;
        double num2 = 13;
        double expectedResult = 25;

        double actualResult = calculationFacade.add(num1, num2);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    void divide() {
        double num1 = 12;
        double num2 = 4;
        double expectedResult = 3;

        double actualResult = calculationFacade.divide(num1, num2);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    void multiply() {
        double num1 = 12;
        double num2 = 4;
        double expectedResult = 48;

        double actualResult = calculationFacade.multiply(num1, num2);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    void subtract() {
        double num1 = 12;
        double num2 = 13;
        double expectedResult = -1;

        double actualResult = calculationFacade.subtract(num1, num2);

        Assertions.assertEquals(expectedResult, actualResult);
    }
}