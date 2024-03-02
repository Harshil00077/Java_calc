package com.example.calculator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.Scanner;
import java.lang.Math;

@SpringBootApplication
public class CalculatorApplication {

    public static void main(String[] args) {

        SpringApplication.run(CalculatorApplication.class, args);
        Scanner scanner = new Scanner(System.in);
        char operator;

        while (true) {
            System.out.println("Choose an operation:");
            System.out.println("1. Factorial   ");
            System.out.println("2. Power (^)");
            System.out.println("3. Natural Log (ln)");
            System.out.println("4. Square Root (√)");
            System.out.println("5- Exit\n");

            operator = scanner.next().charAt(0);

            if (operator >= '5') {
                System.out.println("Exiting calculator...");
                break;
            }

            double num;
            System.out.print("Enter the number: ");
            num = scanner.nextDouble();

            double result;

            switch (operator) {
                case '1':
                    result = factorial((int) num);
                    System.out.println("Result: " + result);
                    break;
                case '2':
                    System.out.print("Enter the exponent: ");
                    double exponent = scanner.nextDouble();
                    result = power(num, exponent);
                    System.out.println("Result: " + result);
                    break;
                case '3':
                    result = naturalLog(num);
                    System.out.println("Result: " + result);
                    break;
                case '4':
                    result = squareRoot(num);
                    System.out.println("Result: " + result);
                    break;
                default:
                    System.out.println("Invalid operation");
            }
        }
        scanner.close();
    }

    public static double factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Factorial is not defined for negative numbers");
        }
        double result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static double power(double base, double exponent) {
        return Math.pow(base, exponent);
    }

    public static double naturalLog(double num) {
        if (num <= 0) {
            throw new IllegalArgumentException("Natural logarithm is not defined for non-positive numbers");
        }
        return Math.log(num);
    }

    public static double squareRoot(double num) {
        if (num < 0) {
            throw new IllegalArgumentException("Square root is not defined for negative numbers");
        }
        return Math.sqrt(num);
    }
}
