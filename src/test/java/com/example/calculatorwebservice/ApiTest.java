package com.example.calculatorwebservice;

import io.restassured.RestAssured;
import org.junit.jupiter.api.Test;
import org.springframework.http.HttpStatus;

public class ApiTest {
    private static final String BaseUrl = "http://localhost:8080/api/calculate/";
    @Test
    public void GetAdd() {
        // Arrange
        double num1 = 2;
        double num2 = 3;
        var uri = BaseUrl + "add/" + num1 + "/" + num2;

        // Act
        var result = RestAssured.when().get(uri);

        // Assert
        result.then().assertThat().statusCode(200);
    }
}
