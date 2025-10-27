package Exercise_02_ArithmeticOperations;

import java.util.Scanner;

/**
 * Main class for the Arithmetic Operation Calculator.
 * This class handles the user interface, inputs/outputs and interacting with the calculator.
 */
public class Main {
    public static void main(String[] args) {

        // Class variables

        // A scanner to handle the user input.
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a 2 number operation (e.g., 5 + 3): ");

        // Read the operation from the user.
        double num1 = input.nextDouble();
        char operator = input.next().charAt(0);
        double num2 = input.nextDouble();

        // This Calculator variable will hold an object of a subclass
        // (e.g. Addition, Subtraction, Multiplication, Subtraction) based on the user input.
        Calculator calculator = null;
        switch (operator) {
            case '+':
                calculator = new Addition();
                break;
            case '-':
                calculator = new Subtraction();
                break;
            case '*':
                calculator = new Multiplication();
                break;
            case '/':
                calculator = new Division();
                break;
            default:
                System.out.println("Error: Invalid operation");
        }

        // If a valid calculator was created, then do the operation and print the result.
        if (calculator != null) {
            double result = calculator.performOperation(num1, num2);
            System.out.println(num1 + " " + operator + " " + num2 + " = " + result);
        }
    }
}
