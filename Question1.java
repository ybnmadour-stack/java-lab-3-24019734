/*
 * Student ID: mj24019734
 * Student Name: Jacob Mphela
 * Question 1 - Countdown
 */

public class Question1 {

    public static void main(String[] args) {

        // Start the countdown from 10
        int number = 10;

        // Keep counting while the number is greater than or equal to 1
        while (number >= 1) {

            // Display the current countdown number
            System.out.println(number);

            // Decrease the number by 1
            number--;
        }

        // Display Liftoff after the countdown is finished
        System.out.println("Liftoff!");
    }
}