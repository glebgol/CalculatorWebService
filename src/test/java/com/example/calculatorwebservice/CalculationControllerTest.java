package com.example.calculatorwebservice;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.http.HttpStatus;


class CalculationControllerTest {

    @Test
    void add() {
        // Arrange
        var controller = new CalculationController();
        double arg1 = 10;
        double arg2 = 11;

        // Act
        var result = controller.Add(arg1, arg2);
        var resultStatusCode = result.getStatusCode();

        // Assert
        Assertions.assertEquals(HttpStatus.OK, resultStatusCode);
    }

    @Test
    void multiply() {
        // Arrange
        var controller = new CalculationController();
        double arg1 = 10;
        double arg2 = 11;

        // Act
        var result = controller.Multiply(arg1, arg2);
        var resultStatusCode = result.getStatusCode();

        // Assert
        Assertions.assertEquals(HttpStatus.OK, resultStatusCode);
    }

    @Test
    void minus() {
        // Arrange
        var controller = new CalculationController();
        double arg1 = 10;
        double arg2 = 11;

        // Act
        var result = controller.Minus(arg1, arg2);
        var resultStatusCode = result.getStatusCode();

        // Assert
        Assertions.assertEquals(HttpStatus.OK, resultStatusCode);
    }

    @Test
    void divide() {
        // Arrange
        var controller = new CalculationController();
        double arg1 = 10;
        double arg2 = 11;

        // Act
        var result = controller.Divide(arg1, arg2);
        var resultStatusCode = result.getStatusCode();

        // Assert
        Assertions.assertEquals(HttpStatus.OK, resultStatusCode);
    }

    @Test
    void divide_returnsBadRequest() {
        // Arrange
        var controller = new CalculationController();
        double arg1 = 10;
        double arg2 = 0;

        // Act
        var result = controller.Divide(arg1, arg2);
        var resultStatusCode = result.getStatusCode();

        // Assert
        Assertions.assertEquals(HttpStatus.BAD_REQUEST, resultStatusCode);
    }
}