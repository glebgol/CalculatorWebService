package com.glebgol.calculatorwebservice.services;

import org.springframework.stereotype.Service;

@Service
public class AdditionServiceImpl implements AdditionService {
    @Override
    public double add(double arg1, double arg2) {
        return arg1 + arg2;
    }
}
