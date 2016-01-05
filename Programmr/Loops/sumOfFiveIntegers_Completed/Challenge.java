package sumOfFiveIntegers_Completed;

import java.util.Scanner;

public class Challenge {
	public static void main(String[] args) {
		int total = 0; // stores the sum of the 5 numbers
		int number; // stores the current input
		Scanner scan = new Scanner(System.in);

		/// { Write your code here

		for (int i = 0; i < 5; i++) {
			System.out.print("Enter an integer: ");
			number = scan.nextInt();
			total += number;
		}

		/// }

		System.out.println("Total is:" + total);
	}
}
