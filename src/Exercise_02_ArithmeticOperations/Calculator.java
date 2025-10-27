package Exercise_02_ArithmeticOperations;

// A abstract base class for all operations.
/**
 * Represents the abstract base class for all operations.
 * This class serves as a blueprint for specific arithmetic operations (like Addition, Subtraction, etc.) by defining a common contract that all subclasses must follow.
 */
public abstract class Calculator {
    public abstract double performOperation(double num1, double num2);
}
