package Exercise_03_EmployeeSalaryCalculation;

/**
 * This class represents a Manager, who is an Employee with an added bonus to the salary.
 */
public class Manager extends Employee{

    private double bonus;

    /**
     * Construct a new Manager object.
     * @param name The manager's full name.
     * @param ID The manager's id.
     * @param baseSalary The manager's base salary.
     * @param bonus The manager's bonus.
     */
    public Manager(String name, int ID, double baseSalary, double bonus) {
        // Call the construct of the parent class (Employee)
        super(name, ID, baseSalary);
        this.bonus = bonus;
    }

    /**
     * Calculates the total salary of the manager.
     * This overrides the parent method in order to include the bonus.
     * @return The base salary plus the bonus.
     */
    public double calculateSalary() {
        return getBaseSalary() + this.bonus;
    }
}
