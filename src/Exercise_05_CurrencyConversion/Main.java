package Exercise_05_CurrencyConversion;

import java.util.Scanner;

/**
 * The main class of the Currency Conversion.
 * It handles the user input and output.
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
            System.out.println("1. Convert amount to Euro");
            System.out.println("2. Change the conversion rate");
            System.out.println("3. Exit");

            int choice = input.nextInt();
            input.nextLine(); // Consume the leftover newline

            switch(choice){
                case 1:
                    System.out.println("Enter amount to convert to Euro: ");
                    double amount = input.nextDouble();
                    input.nextLine();
                    double convertedAmount = CurrencyConverter.convertToEuro(amount);
                    System.out.println(amount + " RON is equal to " + convertedAmount + " EUR.");
                    break;
                case 2:
                    System.out.println("Enter the new conversion rate: ");
                    double newRate = input.nextDouble();
                    input.nextLine();
                    CurrencyConverter.setExchangeRate(newRate);
                    break;
                case 3:
                    input.close();
                    return;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}
