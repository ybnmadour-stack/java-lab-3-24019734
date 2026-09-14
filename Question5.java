/*
 * Student ID: mj24019734
 * Student Name: Jacob Mphela
 * Question 5 - Validating Input
 */

import java.util.Scanner;

public class Question5 {

    public static void main(String[] args) {

        // Create Scanner to get input from the user
        Scanner input = new Scanner(System.in);

        // Store the number entered by the user
        int number;

        // Ask the user for a number at least once
        do {

            // Ask the user to enter a number between 1 and 10
            System.out.print("Enter a number between 1 and 10: ");
            number = input.nextInt();

            // Check if the number is valid
            if (number >= 1 && number <= 10) {

                // The number is within the required range
                System.out.println("Valid number.");

            } else {

                // The number is outside the required range
                System.out.println("Invalid number. Try again.");
            }

        } while (number < 1 || number > 10);

        // Display the valid number
        System.out.println("You entered: " + number);

        input.close();
    }
}