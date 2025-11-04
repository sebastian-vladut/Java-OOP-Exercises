package Exercise_02_ArithmeticOperations;

// An interface for all operations.
/**
 * Represents the abstract interface for all operations.
 * This interface serves as a blueprint for specific arithmetic operations (like Addition, Subtraction, etc.) by defining a common contract that all subclasses must follow.
 */
public interface Calculator {
    public double performOperation(double num1, double num2);
}
