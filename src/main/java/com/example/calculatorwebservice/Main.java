package com.example.calculatorwebservice;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        var facade = new CalculationFacade();
        System.out.println(facade.Add(1, 1));
        System.out.println(facade.Multiply(12, 13));
        System.out.println(facade.Divide(12, 20));
        System.out.println(facade.Minus(100, 300));
    }
}
