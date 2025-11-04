package Exercise_04_ShapePerimeterCalculation;

/**
 * Represents a rectangle, which is a Shape type.
 */
public class Rectangle implements Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    /**
     * Calculates the perimeter of the rectangle.
     * @return The perimeter of the rectangle.
     */
    @Override
    public double calculatePerimeter() {
        return 2 * (length + width);
    }
}
