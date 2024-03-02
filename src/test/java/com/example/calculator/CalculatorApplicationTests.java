package com.example.calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertThrows;

@SpringBootTest
class CalculatorApplicationTests {
    @Test
    public void testPower() {
        double result = CalculatorApplication.power(5, 3);
        Assertions.assertEquals(125, result);
    }

 // temp
    @Test
    public void testFactorial() {
        double result = CalculatorApplication.factorial(5);
        Assertions.assertEquals(120, result);
        assertThrows(IllegalArgumentException.class, () -> {
            CalculatorApplication.factorial(-1);
        });
    }

    @Test
    public void testNaturlLog() {
        double result = CalculatorApplication.naturalLog(Math.E);
        Assertions.assertEquals(1, result);
    }

    @Test
    public void testSqrt() {
        double result = CalculatorApplication.squareRoot( 25);
        Assertions.assertEquals(5, result);
    }
}
