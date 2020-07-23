import java.util.Scanner;

public class EvenNumSum {

	public static void main(String[] args) {
		
		// Init objects
		Scanner input = new Scanner(System.in);
		
		// Ask for integer
		System.out.print("Enter an integer: ");
		int num = input.nextInt() / 2;
		
		// Sum even integers up to num
		int sum = num * (num + 1);
		
		// Print result
		System.out.print("Sum of evens: " + sum);
		
	}

}
