package com.glebgol.calculatorwebservice.services;

import org.springframework.stereotype.Service;

@Service
public class DivisionServiceImpl implements DivisionService {
    @Override
    public double divide(double arg1, double arg2) {
        if (arg2 == 0) {
            throw new IllegalArgumentException("Divide by zero!");
        }
        return arg1 / arg2;
    }
}
