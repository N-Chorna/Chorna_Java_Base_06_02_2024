package ua.hillel.chorna.lessons.lesson6.HW6;

import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int randNumber = (int) (Math.random() * 11);
        int guesses = 5;
        System.out.println("I picked a number between 0 and 10. Which is it? You can guess 5 times.");
        for (int i = 0; i < guesses; i++) {
            System.out.print("Enter your guess: ");
            int guess = scanner.nextInt();
            if (guess == randNumber) {
                System.out.println("Congratulations! You won!");
            } else {
                System.out.println("Wrong! Guess again!");
            }
        }
        System.out.println("You lost. The correct number was " + randNumber);
    }
}
