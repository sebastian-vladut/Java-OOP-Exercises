package Exercise_04_ShapePerimeterCalculation;

/**
 * Represents an abstract geometric shape.
 * This interface serves as a base for all concrete shapes and defines a contract for calculating the perimeter.
 */
public interface Shape {

    /**
     * Calculates the perimeter of the shape.
     * This method must be implemented by all subclasses.
     * @return The perimeter of the shape.
     */
    public double calculatePerimeter();
}
