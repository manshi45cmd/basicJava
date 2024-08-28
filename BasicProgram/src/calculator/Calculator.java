package calculator;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {

    Scanner sc = new Scanner(System.in);

    int num1, num2;
    int choice;
    int result;

    public void enterValue() {
        try {
            System.out.println("Enter 1st number");
            num1 = sc.nextInt();
            System.out.println("Enter 2nd number");
            num2 = sc.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter a valid number.");
            sc.next(); // clear the invalid input
            enterValue(); // retry
        }
    }

    public void calculate() {
        while (true) {
            try {
                System.out.println("1 -Addition \n2 -Substraction \n3 -Multiplication \n4 -Division \n5 -Exit");
                System.out.println("Enter your choice");
                choice = sc.nextInt();

                switch (choice) {
                    case 1: {
                        enterValue();
                        result = num1 + num2;
                        System.out.println("Addition of two numbers :" + result);
                        break;
                    }
                    case 2: {
                        enterValue();
                        result = num1 - num2;
                        System.out.println("Substraction of two numbers :" + result);
                        break;
                    }
                    case 3: {
                        enterValue();
                        result = num1 * num2;
                        System.out.println("Multiplication of two numbers :" + result);
                        break;
                    }
                    case 4: {
                        enterValue();
                        if (num2 == 0) {
                            System.out.println("Cannot divide by zero!");
                            break;
                        }
                        result = num1 / num2;
                        System.out.println("Division of two numbers :" + result);
                        break;
                    }
                    case 5: {
                        System.out.println("Bye Bye");
                        System.exit(0);
                    }
                    default: {
                        System.out.println("Please choose a valid option");
                    }
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid choice.");
                sc.next(); // clear the invalid input
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("WELCOME - HERE YOU CAN CALCULATE");
        Calculator obj = new Calculator();
        obj.calculate();
    }
}