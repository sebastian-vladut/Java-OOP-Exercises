package Exercise_04_ShapePerimeterCalculation;

import java.util.Scanner;

/**
 * The Main class of the Shape Perimeter Calculation.
 * This class handles the user input and output in order to create different types of shapes.
 */
public class Main {

    // A single scanner to handle all user input.
    public static Scanner input = new Scanner(System.in);

    /**
     * The main function of the program.
     * It displays the menu and loops until the user decides to exit.
     */
    public static void main(String[] args) {

        while(true){
            System.out.println("Type of shape: ");
            System.out.println("1. Circle");
            System.out.println("2. Rectangle");
            System.out.println("3. Square");
            System.out.println("4. Exit");

            int choice = input.nextInt();
            input.nextLine(); // Consume the leftover newline

            // Base class variable to hold a specific subclass object
            Shape shape = null;
            switch (choice){
                case 1:
                    System.out.println("Input the radius of the circle: ");
                    double radius = input.nextDouble();
                    input.nextLine(); // Consume the leftover newline
                    shape = new Circle(radius);
                    System.out.println("The perimeter of the circle is: " + shape.calculatePerimeter());
                    break;
                case 2:
                    System.out.println("Input the length of the rectangle: ");
                    double lengthR = input.nextDouble();
                    input.nextLine();
                    System.out.println("Input the width of the rectangle: ");
                    double width = input.nextDouble();
                    input.nextLine();
                    shape = new Rectangle(lengthR, width);
                    System.out.println("The perimeter of the rectangle is: " + shape.calculatePerimeter());
                    break;
                case 3:
                    System.out.println("Input the length of the square: ");
                    double lengthS = input.nextDouble();
                    input.nextLine();
                    shape = new Square(lengthS);
                    System.out.println("The perimeter of the square is: " + shape.calculatePerimeter());
                    break;
                case 4:
                    input.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
