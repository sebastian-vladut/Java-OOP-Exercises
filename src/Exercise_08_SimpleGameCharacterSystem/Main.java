package Exercise_08_SimpleGameCharacterSystem;

import java.util.Scanner;

/**
 * Main class for the Simple Game Character System.
 * This class handles character creation, the turn-based battle loop, and all the user inputs and the outputs.
 */
public class Main {

    // A single scanner to handle all user input.
    static Scanner input = new Scanner(System.in);

    /**
     * The main function of the program.
     * It initialises the players, runs the turn-based battle loop and announces the winner when the battle is over.
     */
    public static void main(String[] args) {

        // Create two characters based on the user input.
        Character player1 = createCharacter("Player 1");
        Character player2 = createCharacter("Player 2");

        System.out.println("BATTLE BEGINS!");
        System.out.println(player1.getName() + " (HP: " + player1.getHealth() + ")");
        System.out.println(player2.getName() + " (HP: " + player2.getHealth() + ")");

        // Run the battle loop as long as the two players are still alive.
        while(player1.isAlive() && player2.isAlive()) {
            // Player's 1 turn
            takeTurn(player1, player2);

            // Check if the battle is over
            if(!player2.isAlive()) {
                break;
            }

            // Player's 2 turn
            takeTurn(player2, player1);
        }

        // Battle is over. Announce the winner.
        System.out.println("BATTLE OVER!");
        if(player1.isAlive()) {
            System.out.println("The winner is " + player1.getName() + "!");
        }
        else if(player2.isAlive()) {
            System.out.println("The winner is " + player2.getName() + "!");
        }

        input.close();
    }

    /**
     * Method to create a new Character based on the user input.
     * Prompts the user to select a class and provide a name for the character.
     * @param player A string to customize the prompt.
     * @return The newly created Character object.
     */
    public static Character createCharacter(String player) {
        System.out.println(player);
        System.out.println("Choose your class:");
        System.out.println("1. Warrior");
        System.out.println("2. Mage");
        System.out.println("3. Archer");

        int choice = input.nextInt();
        input.nextLine();

        System.out.println("Enter your character's name: ");
        String name = input.nextLine();

        Character character = null;
        switch (choice) {
            case 1:
                character = new Warrior(name);
                break;
            case 2:
                character = new Mage(name);
                break;
            case 3:
                character = new Archer(name);
                break;
            default:
                System.out.println("Invalid choice. Defaulting to Warrior.");
                character = new Warrior(name);
                break;
        }

        return character;
    }

    /**
     * Manages the logic for a character's turn
     * Prompts the attacker to choose from 'Attack' or 'Defend'
     * @param attacker The character whose turn it is.
     * @param target The character who is the target of the attack.
     */
    public static void takeTurn(Character attacker, Character target) {
        attacker.resetState();

        System.out.println(attacker.getName() + "'s turn!");
        System.out.println("Health: " + attacker.getHealth());
        System.out.println("Choose your action:");
        System.out.println("1. Attack");
        System.out.println("2. Defend");

        int choice = input.nextInt();
        input.nextLine();

        switch (choice) {
            case 1:
                attacker.attack(target);
                break;
            case 2:
                attacker.defend();
                break;
            default:
                System.out.println("Invalid choice. Defaulting to defend.");
                attacker.defend();
                break;
        }
    }
}
