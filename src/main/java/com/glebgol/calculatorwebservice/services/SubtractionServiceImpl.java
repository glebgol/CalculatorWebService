package com.glebgol.calculatorwebservice.services;

import org.springframework.stereotype.Service;

@Service

public class SubtractionServiceImpl implements SubtractionService {
    @Override
    public double subtract(double arg1, double arg2) {
        return arg1 - arg2;
    }
}
