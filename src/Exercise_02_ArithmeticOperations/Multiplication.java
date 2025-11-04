package Exercise_02_ArithmeticOperations;

/**
 * Represents the multiplication operation.
 * This class extends the Calculator to multiply one number by another.
 */
public class Multiplication implements Calculator {
    public double performOperation(double num1, double num2) {
        return num1 * num2;
    }
}
