package Exercise_03_EmployeeSalaryCalculation;

/**
 * This class represents a Developer, who is an Employee with added overtime pay.
 */
public class Developer extends Employee {
    private double overtimePay;

    public Developer(String name, int id, double baseSalary, double overtimePay) {
        // Call the constructor of the parent class (Employee)
        super(name, id, baseSalary);
        this.overtimePay = overtimePay;
    }

    /**
     * Calculate the total salary for the developer.
     * This overrides the parent method to include the overtime pay.
     * @return The base salary plus the overtime pay.
     */
    public double calculateSalary() {
        return getBaseSalary() + this.overtimePay;
    }
}
