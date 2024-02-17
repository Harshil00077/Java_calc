package com.example.calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CalculatorApplicationTests {
    @Test
    public void testAddition() {
        double result = CalculatorApplication.add(5, 3);
        Assertions.assertEquals(8, result);
    }


    @Test
    public void testSubtraction() {
        double result = CalculatorApplication.subtract(5, 3);
        Assertions.assertEquals(2, result);
    }

    @Test
    public void testMultiplication() {
        double result = CalculatorApplication.multiply(5, 3);
        Assertions.assertEquals(15, result);
    }

    @Test
    public void testDivision() {
        double result = CalculatorApplication.divide(10, 2);
        Assertions.assertEquals(5, result);
    }

    @Test
    public void testDivisionByZero() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            CalculatorApplication.divide(10, 0);
        });
    }
}