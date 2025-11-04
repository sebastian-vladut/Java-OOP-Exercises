package Exercise_07_AnimalSoundSimulation;

import java.util.Scanner;

public class Main {

    // A single scanner to handle all user input.
    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        while(true) {
            System.out.println("1. Bird");
            System.out.println("2. Cat");
            System.out.println("3. Dog");
            System.out.println("4. Exit");

            int choice = input.nextInt();
            input.nextLine(); // Consume the leftover newline

            Animal animal = null;
            switch (choice) {
                case 1:
                    animal = new Bird();
                    System.out.println("The bird makes " +  animal.makeSound() + ".");
                    break;
                case 2:
                    animal = new Cat();
                    System.out.println("The cat makes " +  animal.makeSound() + ".");
                    break;
                case 3:
                    animal = new Dog();
                    System.out.println("The dog makes " +  animal.makeSound() + ".");
                    break;
                case 4:
                    input.close();
                    return;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}
