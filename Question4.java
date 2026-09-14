/*
 * Student ID: mj24019734
 * Student Name: Jacob Mphela
 * Question 4 - Repeating Menu
 */

import java.util.Scanner;

public class Question4 {

    public static void main(String[] args) {

        // Create Scanner to get input from the user
        Scanner input = new Scanner(System.in);

        // Store the user's menu choice
        int choice;

        // Display the menu at least once
        do {

            // Display the menu options
            System.out.println("\n===== MENU =====");
            System.out.println("1. Continue");
            System.out.println("2. Exit");

            // Ask the user to choose an option
            System.out.print("Enter your choice: ");
            choice = input.nextInt();

            // Check the user's choice
            if (choice == 1) {

                // Continue the program
                System.out.println("You chose Continue.");

            } else if (choice == 2) {

                // Exit the program
                System.out.println("Exiting the program...");

            } else {

                // Tell the user if the choice is invalid
                System.out.println("Invalid choice. Please choose 1 or 2.");
            }

        } while (choice != 2);

        // Display the final message
        System.out.println("Goodbye!");

        input.close();
    }
}