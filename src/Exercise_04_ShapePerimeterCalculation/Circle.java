package Exercise_04_ShapePerimeterCalculation;

/**
 * Represents a circle, which is a Shape type.
 */
public class Circle implements Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    /**
     * Calculates the perimeter (circumference) of the circle.
     * @return The perimeter of the circle.
     */
    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}
