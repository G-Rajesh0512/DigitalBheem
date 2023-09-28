import java.util.Random;
import java.util.Scanner;
public class SimpleGameProject {
	public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);
		        Random random = new Random();
		        int targetNumber = random.nextInt(100) + 1;
		        int attempts = 10;
		        int userScore = 0;

		        System.out.println("Welcome to the Guessing Game!");
		        System.out.println("Try to guess the number between 1 and 100.");

		        while (attempts > 0) {
		            System.out.print("Enter your guess: ");
		            int userGuess = scanner.nextInt();

		            if (userGuess == targetNumber) {
		                System.out.println("Congratulations! You guessed the correct number.");
		                userScore += attempts;
		                break;
		            } else if (userGuess < targetNumber) {
		                System.out.println("Higher! Attempts left: " + --attempts);
		            } else {
		                System.out.println("Lower! Attempts left: " + --attempts);
		            }
		        }

		        System.out.println("Your score: " + userScore);
		        scanner.close();

	}

}
