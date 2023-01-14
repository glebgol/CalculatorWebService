package com.glebgol.calculatorwebservice.controllers;

import io.restassured.response.Response;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.*;

class CalculationControllerTest {
    @BeforeAll
    public static void setUp() {
        baseURI = "http://localhost/api/v1/";
        port = 8080;
    }

    @Test
    public void add() {
        double arg1 = 10;
        double arg2 = 20;
        double expectedResult = 30;

        Response response = given()
                .queryParam("arg1", arg1)
                .queryParam("arg2", arg2)
                .expect().statusCode(200)
                .when()
                .post("/add");

        double actualResult = response.then().extract().body().htmlPath().getDouble("body");

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void subtract() {
        double arg1 = 10;
        double arg2 = 20;
        double expectedResult = -10;

        Response response = given()
                .queryParam("arg1", arg1)
                .queryParam("arg2", arg2)
                .expect().statusCode(200)
                .when()
                .post("/subtract");

        double actualResult = response.then().extract().body().htmlPath().getDouble("body");

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void divideByZeroStatusCode400() {
        double arg1 = 10;
        double arg2 = 0;

        given()
                .queryParam("arg1", arg1)
                .queryParam("arg2", arg2)
                .expect().statusCode(400)
                .when()
                .post("/divide");
    }

    @Test
    public void divide() {
        double arg1 = 10;
        double arg2 = 20;
        double expectedResult = 0.5;

        Response response = given()
                .queryParam("arg1", arg1)
                .queryParam("arg2", arg2)
                .expect().statusCode(200)
                .when()
                .post("/divide");

        double actualResult = response.then().extract().body().htmlPath().getDouble("body");

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void multiply() {
        double arg1 = 10;
        double arg2 = 20;
        double expectedResult = 200;

        Response response = given()
                .queryParam("arg1", arg1)
                .queryParam("arg2", arg2)
                .expect().statusCode(200)
                .when()
                .post("/multiply");

        double actualResult = response.then().extract().body().htmlPath().getDouble("body");

        Assertions.assertEquals(expectedResult, actualResult);
    }
}