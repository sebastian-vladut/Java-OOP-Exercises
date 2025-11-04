package Exercise_03_EmployeeSalaryCalculation;

import java.util.Scanner;

/**
 * Main class for the Employee Salary Calculation.
 * This class handles user input and output in order to create different types of employees.
 */
public class Main {

    // A single scanner to handle all user input.
    public static Scanner input = new Scanner(System.in);

    /**
     * The main function of the program.
     * It displays the manu and loops until the user decides to exit.
     */
    public static void main(String[] args) {

        while(true){
            System.out.println("The type of the employee");
            System.out.println("1. Manager");
            System.out.println("2. Developer");
            System.out.println("3. Exit");

            int choice = input.nextInt();
            input.nextLine(); // Consume the leftover newline

            // Base class variable to hold a specific subclass object
            Employee employee = null;
            switch(choice){
                case 1:
                    employee = createManager();
                    System.out.println("The salary of the manager " + employee.getName() + " is " + employee.calculateSalary());
                    break;
                case 2:
                    employee = createDeveloper();
                    System.out.println("The salary of the developer " + employee.getName() + " is " + employee.calculateSalary());
                    break;
                case 3:
                    input.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    /**
     * Gather the details from the user in order to create a new Manager object.
     * @return The newly created Manager object.
     */
    public static Employee createManager(){
        System.out.println("Name: ");
        String name = input.nextLine();

        System.out.println("ID: ");
        int id = input.nextInt();
        input.nextLine();

        System.out.println("BaseSalary: ");
        double baseSalary = input.nextDouble();
        input.nextLine();

        System.out.println("Bonus: ");
        double bonus = input.nextDouble();
        input.nextLine();

        return new Manager(name, id, baseSalary, bonus);
    }

    /**
     * Gather the details from the user in order to create a new Developer object.
     * @return The newly created Developer object.
     */
    public static Employee createDeveloper(){
        System.out.println("Name: ");
        String name = input.nextLine();

        System.out.println("ID: ");
        int id = input.nextInt();
        input.nextLine();

        System.out.println("BaseSalary: ");
        double baseSalary = input.nextDouble();
        input.nextLine();

        System.out.println("Overtime Pay: ");
        double overtimePay = input.nextDouble();
        input.nextLine();

        return new Developer(name, id, baseSalary, overtimePay);
    }
}
