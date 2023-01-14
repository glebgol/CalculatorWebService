package com.glebgol.calculatorwebservice.services;

import org.springframework.stereotype.Service;

@Service
public class MultiplyServiceImpl implements MultiplyService {
    @Override
    public double multiply(double arg1, double arg2) {
        return arg1 * arg2;
    }
}
