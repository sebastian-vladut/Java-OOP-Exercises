package Exercise_01_BankAccountSystem;

import java.util.Scanner;
import java.util.ArrayList;

/**
 * Main class for the Bank Account System.
 * This class handles the user interface, I/O and the logic for creating accounts, logging in and interacting with the bank accounts.
 */
public class Main {

    // Class Variables

    // A dynamic array to store all the bank accounts. A real application would use a database.
    private static ArrayList<BankAccount> bankAccounts =  new ArrayList<>();

    // A Scanner to handle the user input.
    private static Scanner input = new Scanner(System.in);

    /**
     * The main function for the application.
     * Displays the primary menu and loops until the user exits or the account number limit is reached.
     */
    public static void main(String[] args) {
        // Main application loop
        while(true) {
            System.out.println("Welcome to the Bank Account System");
            System.out.println("1. Create New Account");
            System.out.println("2. Login to Your Account");
            System.out.println("3. Exit");
            System.out.println("Choose an option: ");

            int option = input.nextInt();
            input.nextLine(); // For the leftover newline character after nextInt()

            switch (option) {
                case 1:
                    createAccount();
                    break;
                case 2:
                    login();
                    break;
                case 3:
                    System.out.println("Good Bye!");
                    return; // Exit the program
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }

    /**
     * Handles the logic for creating a new bank account.
     * Prompts the user for their name and password, generates a random account number and stores the new BankAccount object in the array.
     */
    public static void createAccount() {

        System.out.println("Enter your first name: ");
        String firstName = input.nextLine();
        System.out.println("Enter your last name: ");
        String lastName = input.nextLine();
        String holderName = firstName + " " + lastName;

        System.out.println("Create a password: ");
        String password = input.nextLine();

        // Generates a number from 100000 to 999999
        int accountNumber = (int)(Math.random() * 900000) + 100000;

        // Create a new account with initial balance 0
        BankAccount newBankAccount = new BankAccount(accountNumber, 0.0, holderName, password);
        bankAccounts.add(newBankAccount);

        System.out.println("Account number " + accountNumber + " created successfully!");
    }

    /**
     * Handles the logic for deleting an existing account.
     * @param logInAccount is the BankAccount object of the currently logged-in user.
     * @return true if the account have been deleted and false otherwise.
     */
    public static boolean deleteAccount(BankAccount logInAccount) {
        System.out.println("Are you sure you want to delete this account?");
        System.out.println("1. Yes");
        System.out.println("2. No");
        System.out.println("Choose an option: ");

        int choice = input.nextInt();
        input.nextLine();

        switch (choice) {
            case 1:
                bankAccounts.remove(logInAccount);
                System.out.println("Account number " + logInAccount.getAccountNumber() + " deleted successfully!");
                return true;
            case 2:
                System.out.println("Thank you for keeping this account.");
            default:
                System.out.println("Invalid option. Please try again.");
        }
        return false;
    }

    /**
     * Handles the logic for logging into an existing account.
     * Prompts for name and password, then searches the array for a matching account.
     * If found, it proceeds to the account menu.
     */
    public static void login(){
        System.out.println("Enter your first name: ");
        String firstName = input.nextLine();
        System.out.println("Enter your last name: ");
        String lastName = input.nextLine();
        String holderName = firstName + " " + lastName;

        System.out.println("Enter your password: ");
        String password = input.nextLine();

        BankAccount logInAccount = null;

        // Loop through all created accounts to find a match
        for (int i = 0; i < bankAccounts.size(); i++){
            if (bankAccounts.get(i).getHolderName().equals(holderName) && bankAccounts.get(i).checkPassword(password)){
                logInAccount = bankAccounts.get(i);
                break;
            }
        }

        // Check if a match was found
        if (logInAccount == null){
            System.out.println("Login Failed. Invalid username or password.");
        }
        else{
            System.out.println("Login Successful! Welcome, " + logInAccount.getHolderName());
            showMenu(logInAccount); // Shows the account menu
        }
    }

    /**
     * Displays the menu for a logged-in user.
     * This menu allows the user to deposit, withdraw, check the balance or log out.
     * @param logInAccount is the BankAccount object of the currently logged-in user.
     */
    public static void showMenu(BankAccount logInAccount){
        // Loop for the account menu until the user decides to log out
        while(logInAccount != null){
            System.out.println("Account Menu");
            System.out.println("Account Number: " + logInAccount.getAccountNumber());
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Delete Account");
            System.out.println("5. Logout");
            System.out.println("Choose an option: ");

            int option = input.nextInt();
            input.nextLine();

            switch (option) {
                case 1:
                    System.out.println("Enter amount to deposit: ");
                    double depositAmount = input.nextDouble();
                    input.nextLine();
                    logInAccount.deposit(depositAmount);
                    break;
                case 2:
                    System.out.println("Enter amount to withdraw: ");
                    double withdrawAmount = input.nextDouble();
                    input.nextLine();
                    logInAccount.withdraw(withdrawAmount);
                    break;
                case 3:
                    System.out.println("Your current balance is: " + logInAccount.getBalance());
                    break;
                case 4:
                    boolean isDeleted = deleteAccount(logInAccount);
                    if (isDeleted){
                        logInAccount = null;
                    }
                    break;
                case 5:
                    System.out.println("Good Bye!");
                    return; // Exit the account menu and return to the main menu.
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}
