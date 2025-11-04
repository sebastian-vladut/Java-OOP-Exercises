package Exercise_06_TicketPricing;

import java.util.Scanner;

/**
 * The Main class of the Ticket Pricing program.
 * It handles the input and output of the program.
 */
public class Main {

    // A single scanner to handle all user input.
    public static Scanner input = new Scanner(System.in);

    /**
     * The main function of the program.
     * It displays a menu and loops until the user decides to exit.
     */
    public static void main(String[] args) {
        while(true) {
            System.out.println("1. Buy a ticket");
            System.out.println("2. Exit");

            int choice = input.nextInt();
            input.nextLine(); // Consume the leftover newline

            switch (choice) {
                case 1:
                    System.out.println("Input your age: ");
                    int age = input.nextInt();
                    input.nextLine(); // Consume the leftover newline.

                    Ticket ticket = null;
                    if(age < 18) { // The user is a child.
                        ticket = new ChildTicket();
                    }
                    else if(age < 50) { // The user is an adult.
                        ticket = new AdultTicket();
                    }
                    else { // The user is a senior.
                        ticket = new SeniorTicket();
                    }

                    System.out.println("The price of the ticket is " + ticket.calculatePrice() + ".");
                    break;
                case 2:
                    input.close();
                    return;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}
