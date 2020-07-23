import java.util.Scanner;
import java.util.Random;

public class AgeGuess {

	public static void main(String[] args) {
		
		// Init variables
		String name;
		int ageGuess, age;
		
		// Init objects
		Random rng = new Random();
		Scanner scan = new Scanner(System.in);
		
		// Ask for name
		System.out.print("Enter name: ");
		name = scan.nextLine();
		
		// Create random age
		age = rng.nextInt(101);
		
		// Ask for age guess
		System.out.print("Guess age: ");
		ageGuess = scan.nextInt();
		
		// Tell the user if they are wrong
		while (ageGuess != age) {
			
			System.out.println("You guessed Wrong!");
			
			// Check if age is younger or older
			if(ageGuess > age) {
				System.out.println("Age is younger");
			} else {
				System.out.println("Age is older");
			}
			
			// Ask to guess again
			System.out.print("Try another guess: ");
			ageGuess = scan.nextInt();
		}
		
		// Tell the user they are right
		System.out.println("That's right! " + name + " is " + age);
	}

}