import java.util.Scanner;

public class VowelCounter {

	public static void main(String[] args) {
		
		//init variables
		int vowels = 0;
		int others = 0;
		
		// init scanner
		Scanner input = new Scanner(System.in);
		
		// Ask for a string
		System.out.print("Enter a string: ");
		String userString =  input.nextLine();
		
		// Iterate through each char in string
		for (int i = 0; i < userString.length(); i++) {
			switch (userString.charAt(i)) {
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				vowels++;
				break;
			default:
				others++;
			}
		}
		
		// Print results
		System.out.println("Lower case vowels: " + vowels + "\nOther Characters: " + others);
	}

}
