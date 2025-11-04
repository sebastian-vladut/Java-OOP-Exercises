package Exercise_03_EmployeeSalaryCalculation;

/**
 * This class represents a general employee.
 * This class serves as a base for the more specialised types of employees.
 */
public class Employee {

    // Private fields to protect data (encapsulation)
    private String name;
    private int ID;
    private double baseSalary;

    /**
     * Construct a new Employee object.
     * @param name The employee's full name.
     * @param ID The employee's ID.
     * @param baseSalary The employee's base salary.
     */
    public Employee(String name, int ID, double baseSalary) {
        this.name = name;
        this.ID = ID;
        this.baseSalary = baseSalary;
    }

    // Public methods for secure access to private fields.
    public String getName() {
        return name;
    }

    public int getID() {
        return ID;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    /**
     * Calculates the total salary for the employee.
     * For a basic employee it is just the base salary/
     * This method is intended to be overridden by subclasses.
     * @return The calculated total salary.
     */
    public double calculateSalary() {
        return this.baseSalary;
    }
}
