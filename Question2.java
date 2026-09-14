/*
 * Student ID: mj24019734
 * Student Name: Jacob Mphela
 * Question 2 - Sum of Numbers
 */

import java.util.Scanner;

public class Question2 {

    public static void main(String[] args) {

        // Create Scanner to get input from the user
        Scanner input = new Scanner(System.in);

        // Ask the user to enter a positive whole number
        System.out.print("Enter a positive whole number: ");
        int number = input.nextInt();

        // Store the running sum
        int sum = 0;

        // Start counting from 1
        int currentNumber = 1;

        // Continue until we reach the number entered by the user
        while (currentNumber <= number) {

            // Add the current number to the sum
            sum = sum + currentNumber;

            // Move to the next number
            currentNumber++;
        }

        // Display the final sum
        System.out.println("The sum is: " + sum);

        input.close();
    }
}