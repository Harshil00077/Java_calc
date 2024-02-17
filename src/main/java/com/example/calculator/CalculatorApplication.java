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
        double num1, num2, result;

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

            System.out.print("Enter first number: ");
            num1 = scanner.nextDouble();

            System.out.print("Enter second number: ");
            num2 = scanner.nextDouble();

            switch (operator) {
                case '1':
                    result = num1 + num2;
                    System.out.println("Result: " + result);
                    break;
                case '2':
                    result = num1 - num2;
                    System.out.println("Result: " + result);
                    break;
                case '3':
                    result = num1 * num2;
                    System.out.println("Result: " + result);
                    break;
                case '4':
                    if (num2 != 0) {
                        result = num1 / num2;
                        System.out.println("Result: " + result);
                    } else {
                        System.out.println("Error: Division by zero");
                    }
                    break;
                default:
                    System.out.println("Invalid operation");
            }
        }
        scanner.close();

    }

}
