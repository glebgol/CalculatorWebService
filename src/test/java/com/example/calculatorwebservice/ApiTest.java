package com.example.calculatorwebservice;

import io.restassured.RestAssured;
import org.junit.jupiter.api.Test;

public class ApiTest {
    private static final String BaseUrl = "http://localhost:8080/api/calculate/";
    @Test
    public void GetAdd_Returns_200_StatusCode() {
        // Arrange
        double num1 = 2;
        double num2 = 3;
        var uri = BaseUrl + "add/" + num1 + "/" + num2;

        // Act
        var result = RestAssured.when().get(uri);

        // Assert
        result.then().assertThat().statusCode(200);
    }

    @Test
    public void GetMultiply_Returns_200_StatusCode() {
        // Arrange
        double num1 = 2;
        double num2 = 3;
        var uri = BaseUrl + "multiply/" + num1 + "/" + num2;

        // Act
        var result = RestAssured.when().get(uri);

        // Assert
        result.then().assertThat().statusCode(200);
    }

    @Test
    public void GetMinus_Returns_200_StatusCode() {
        // Arrange
        double num1 = 2;
        double num2 = 3;
        var uri = BaseUrl + "minus/" + num1 + "/" + num2;

        // Act
        var result = RestAssured.when().get(uri);

        // Assert
        result.then().assertThat().statusCode(200);
    }

    @Test
    public void GetDivide_Returns_200_StatusCode() {
        // Arrange
        double num1 = 2;
        double num2 = 3;
        var uri = BaseUrl + "divide/" + num1 + "/" + num2;

        // Act
        var result = RestAssured.when().get(uri);

        // Assert
        result.then().assertThat().statusCode(200);
    }

    @Test
    public void GetDivide_Returns_400_StatusCode() {
        // Arrange
        double num1 = 2;
        double num2 = 0;
        var uri = BaseUrl + "divide/" + num1 + "/" + num2;

        // Act
        var result = RestAssured.when().get(uri);

        // Assert
        result.then().assertThat().statusCode(400);
    }
}
