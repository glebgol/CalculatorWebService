package com.glebgol.calculatorwebservice.facade;

import com.glebgol.calculatorwebservice.services.*;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class CalculationFacadeImpl implements CalculationFacade {
    protected AdditionService additionService;
    protected DivisionService divisionService;
    protected MultiplyService multiplyService;
    protected SubtractionService subtractionService;

    @Override
    public double add(double arg1, double arg2) {
        return additionService.add(arg1, arg2);
    }

    @Override
    public double divide(double arg1, double arg2) {
        return divisionService.divide(arg1, arg2);
    }

    @Override
    public double multiply(double arg1, double arg2) {
        return multiplyService.multiply(arg1, arg2);
    }

    @Override
    public double subtract(double arg1, double arg2) {
        return subtractionService.subtract(arg1, arg2);
    }
}
