package com.example.calculatorwebservice;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/calculate")
public class CalculationController {
    @GetMapping("add/{firstArg}/{secondArg}")
    public ResponseEntity<Double> Add(@PathVariable Double firstArg, @PathVariable Double secondArg) {
        return new ResponseEntity<Double>(firstArg + secondArg, HttpStatus.ACCEPTED);
    }
}
