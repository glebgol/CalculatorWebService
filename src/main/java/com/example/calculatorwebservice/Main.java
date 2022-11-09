package com.example.calculatorwebservice;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        var calculationFacade = new CalculationFacade();

        var sum = calculationFacade.Add(1, 1);
        var multiplication = calculationFacade.Multiply(12, 13);
        var division = calculationFacade.Divide(12, 20);
        var difference = calculationFacade.Minus(100, 300);

        System.out.println(sum);
        System.out.println(multiplication);
        System.out.println(division);
        System.out.println(difference);
    }
}
