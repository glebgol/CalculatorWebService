package com.example.calculatorwebservice;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class CalculationEngineTest {

    @Test
    void add() {
        // Arrange
        double expectedResult = 12.0;
        double arg1 = 5.0;
        double arg2 = 7.0;

        // Act
        var result = CalculationEngine.Add(arg1, arg2);

        // Assert
        Assertions.assertEquals(expectedResult, result);
    }

    @Test
    void minus() {
        // Arrange
        double expectedResult = -2;
        double arg1 = 5.0;
        double arg2 = 7.0;

        // Act
        var result = CalculationEngine.Minus(arg1, arg2);

        // Assert
        Assertions.assertEquals(expectedResult, result);
    }

    @Test
    void multiply() {
        // Arrange
        double expectedResult = 35.0;
        double arg1 = 5.0;
        double arg2 = 7.0;

        // Act
        var result = CalculationEngine.Multiply(arg1, arg2);

        // Assert
        Assertions.assertEquals(expectedResult, result);
    }

    @Test
    void divide() {
        // Arrange
        double expectedResult = 5.0 / 7.0;
        double arg1 = 5.0;
        double arg2 = 7.0;

        // Act
        var result = CalculationEngine.Divide(arg1, arg2);

        // Assert
        Assertions.assertEquals(expectedResult, result);
    }

    @Test
    void divide_throwsIllegalArgument() {
        // Arrange
        double arg1 = 5.0;
        double arg2 = 0;

        // Assert
        Assertions.assertThrows(IllegalArgumentException.class, () -> CalculationEngine.Divide(arg1, arg2));
    }
}