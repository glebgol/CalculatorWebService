package com.glebgol.calculatorwebservice.controllers;

import com.glebgol.calculatorwebservice.facade.CalculationFacade;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/")
@AllArgsConstructor
public class CalculationController {
    CalculationFacade calculationFacade;

    @PostMapping("/add")
    public ResponseEntity<Double> add(@RequestParam("arg1") Double arg1, @RequestParam("arg2") Double arg2) {
        double result = calculationFacade.add(arg1, arg2);
        return new ResponseEntity<>(result, HttpStatus.OK);
    }

    @PostMapping("/multiply")
    public ResponseEntity<Double> multiply(@RequestParam("arg1") Double arg1, @RequestParam("arg2") Double arg2) {
        double result = calculationFacade.multiply(arg1, arg2);
        return new ResponseEntity<>(result, HttpStatus.OK);
    }

    @PostMapping("/subtract")
    public ResponseEntity<Double> subtract(@RequestParam("arg1") Double arg1, @RequestParam("arg2") Double arg2) {
        double result = calculationFacade.subtract(arg1, arg2);
        return new ResponseEntity<>(result, HttpStatus.OK);
    }

    @PostMapping("/divide")
    public ResponseEntity<Double> divide(@RequestParam("arg1") Double arg1, @RequestParam("arg2") Double arg2) {
        double result;
        try {
            result = calculationFacade.divide(arg1, arg2);
        } catch (IllegalArgumentException ex) {
            return ResponseEntity.badRequest().build();
        }
        return new ResponseEntity<>(result, HttpStatus.OK);
    }
}
