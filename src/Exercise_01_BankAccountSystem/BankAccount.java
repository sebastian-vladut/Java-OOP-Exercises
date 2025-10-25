package Exercise_01_BankAccountSystem;

/**
 * This Class represents a bank account.
 * This class encapsulates the account's data, such as account number, balance, holder's name, providing public methods to interact with this data securely.
 */
public class BankAccount {

    // Private Fields
    // Encapsulation: All the fields are private and access is controlled through public methods.

    // The number identifying the bank account.
    private int accountNumber;

    // The current balance of the account.
    private double balance;

    // The name of the account holder.
    private String holderName;

    // The password used to authenticate the account holder.
    private String password;

    /**
     * Construct a new BankAccount.
     * @param accountNumber The number of the account.
     * @param balance The initial balance of the account.
     * @param holderName The name of the account's holder.
     * @param password The password for account access.
     */
    public BankAccount(int accountNumber, double balance, String holderName, String password) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.holderName = holderName;
        this.password = password;
    }

    /**
     * Withdraws a specified amount from the account balance.
     * The withdrawal will fail if the amount is grater than the current balance or is negative.
     * @param amount The amount to be withdrawn.
     */
    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient funds!");
        }
        else if (amount < 0) {
            System.out.println("Invalid amount!");
        }
        else {
            balance -= amount;
            System.out.println("You have successfully withdrew " + amount + ". New balance: " + balance);
        }
    }

    /**
     * Deposit a specified amount into the account.
     * @param amount The amount to be deposited. Must be positive.
     */
    public void deposit(double amount) {
        if (amount >= 0) {
            balance += amount;
            System.out.println("You have successfully deposited " + amount + ". New balance: " + balance);
        }
        else {
            System.out.println("Invalid amount!");
        }
    }

    /**
     * Retrieves the current balance of the account.
     * @return The current balance as a double.
     */
    public double getBalance() {
        return balance;
    }

    /**
     * Retrieves the name of the account holder.
     * @return The account holder's name as a String.
     */
    public String getHolderName() {
            return holderName;
    }

    /**
     * Retrieves the account number.
     * @return The account number as an int.
     */
    public int getAccountNumber() {
        return accountNumber;
    }

    /**
     * Checks if the provided password matches the account password.
     * @param inputPassword The attempted password to check.
     * @return true if the passwords match and false otherwise.
     */
    public boolean checkPassword(String inputPassword) {
        return password.equals(inputPassword);
    }

}
