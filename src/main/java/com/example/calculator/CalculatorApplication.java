package com.example.calculator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.Scanner;

@SpringBootApplication
public class CalculatorApplication {


    public static void main(String[] args) {

        SpringApplication.run(CalculatorApplication.class, args);
        Scanner scanner = new Scanner(System.in);
        char operator;

        while (true) {
            System.out.println("Choose an operation:");
            System.out.println("1. Addition (+)");
            System.out.println("2. Subtraction (-)");
            System.out.println("3. Multiplication (*)");
            System.out.println("4. Division (/)");
            System.out.println("5. Exit");

            operator = scanner.next().charAt(0);

            if (operator == '5') {
                System.out.println("Exiting calculator...");
                break;
            }

            double num1, num2;
            System.out.print("Enter first number: ");
            num1 = scanner.nextDouble();

            System.out.print("Enter second number: ");
            num2 = scanner.nextDouble();

            double result;

            switch (operator) {
                case '1':
                    result = add(num1, num2);
                    System.out.println("Result: " + result);
                    break;
                case '2':
                    result = subtract(num1, num2);
                    System.out.println("Result: " + result);
                    break;
                case '3':
                    result = multiply(num1, num2);
                    System.out.println("Result: " + result);
                    break;
                case '4':
                    result = divide(num1, num2);
                    if (!Double.isNaN(result)) {
                        System.out.println("Result: " + result);
                    }
                    break;
                default:
                    System.out.println("Invalid operation");
            }
        }
        scanner.close();
    }

    public static double add(double num1, double num2) {
        return num1 + num2;
    }

    public static double subtract(double num1, double num2) {
        return num1 - num2;
    }

    public static double multiply(double num1, double num2) {
        return num1 * num2;
    }

    public static double divide(double num1, double num2) {
        if (num2 != 0) {
            return num1 / num2;
        } else {
            System.out.println("Error: Division by zero");
            return Double.NaN;
        }
    }
}
