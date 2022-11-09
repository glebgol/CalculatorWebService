package com.example.calculatorwebservice;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class CalculationFacadeTest {

    @Test
    void add() throws IOException {
        // Arrange
        var facade = new CalculationFacade();
        double expectedResult = 12.0;
        double arg1 = 5.0;
        double arg2 = 7.0;

        // Act
        var result = facade.Add(arg1, arg2);

        // Assert
        Assertions.assertEquals(expectedResult, result);
    }

    @Test
    void multiply() throws IOException {
        // Arrange
        var facade = new CalculationFacade();
        double expectedResult = 35.0;
        double arg1 = 5.0;
        double arg2 = 7.0;

        // Act
        var result = facade.Multiply(arg1, arg2);

        // Assert
        Assertions.assertEquals(expectedResult, result);
    }

    @Test
    void minus() throws IOException {
        // Arrange
        var facade = new CalculationFacade();
        double expectedResult = -2;
        double arg1 = 5.0;
        double arg2 = 7.0;

        // Act
        var result = facade.Minus(arg1, arg2);

        // Assert
        Assertions.assertEquals(expectedResult, result);
    }

    @Test
    void divide() throws IOException {
        // Arrange
        var facade = new CalculationFacade();
        double expectedResult = 5.0 / 7.0;
        double arg1 = 5.0;
        double arg2 = 7.0;

        // Act
        var result = facade.Divide(arg1, arg2);

        // Assert
        Assertions.assertEquals(expectedResult, result);
    }

    @Test
    void divide_throwsIllegalArgument() throws IOException {
        // Arrange
        var facade = new CalculationFacade();
        double arg1 = 5.0;
        double arg2 = 0;

        // Assert
        Assertions.assertThrows(IllegalArgumentException.class, () -> facade.Divide(arg1, arg2));
    }
}