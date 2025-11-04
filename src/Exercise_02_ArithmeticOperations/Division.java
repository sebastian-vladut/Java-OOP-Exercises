package Exercise_02_ArithmeticOperations;

/**
 * Represents the division operation.
 * This class extends the Calculator to divide one number by another.
 */
public class Division implements Calculator {
    public double performOperation(double num1, double num2) {
        if (num2 == 0) {
            System.out.println("Error: Division by zero");
            return 0;
        }
        return num1 / num2;
    }
}
