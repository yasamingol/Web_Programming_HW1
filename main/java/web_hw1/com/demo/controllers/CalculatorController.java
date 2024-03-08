package web_hw1.com.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {

    @GetMapping("/calc/{operator}/{op1}/{op2}")
    public String calculate(@PathVariable String operator, @PathVariable int op1, @PathVariable int op2) {

        int result = 0;

        switch(operator) {
            case "sum":
                result = op1 + op2;
                break;
            case "div":
                result = op1 / op2;
                break;
            case "mult":
                result = op1 * op2;
                break;
            case "subtract":
                result = op1 - op2;
                break;
        }

        return op1 + " " + operator + " " + op2 + " = " + result;
    }

}

