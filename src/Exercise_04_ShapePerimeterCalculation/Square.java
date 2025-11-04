package Exercise_04_ShapePerimeterCalculation;

/**
 * Represents a square, which is a Shape type.
 */
public class Square implements Shape {
    private double length;

    public Square(double length) {
        this.length = length;
    }

    /**
     * Calculates the perimeter of the square.
     * @return The perimeter of the square.
     */
    @Override
    public double calculatePerimeter() {
        return 4 * length;
    }
}
