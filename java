import java.util.Scanner;

public class NumberGuessingGame {
   public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       int targetNumber = 1 + (int) (100 * Math.random());
       int maxAttempts = 5;
       int attempts = 0;

       System.out.println("A number is chosen between 1 and 100.");
       System.out.println("You have " + maxAttempts + " attempts to guess the correct number.");

       while (attempts < maxAttempts) {
           System.out.print("Enter your guess: ");
           int userGuess = scanner.nextInt();
           attempts++;

           if (userGuess == targetNumber) {
               System.out.println("Congratulations! You guessed the correct number in " + attempts + " attempts.");
               break;
           } else if (userGuess < targetNumber) {
               System.out.println("The number is greater than " + userGuess);
           } else {
               System.out.println("The number is less than " + userGuess);
           }
       }

       if (attempts == maxAttempts) {
           System.out.println("You've exhausted all attempts. The correct number was: " + targetNumber);
       }
       scanner.close();
   }
}
