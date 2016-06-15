package collatzSequence_Completed;

import java.util.Scanner;

class Challenge {

	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Starting number:");
		int number = scanner.nextInt();
		if (number < 1) {
			System.out.println("Please insert a natural number:");
		}
		int counter = 0;
		System.out.print(number + " ");

		/// {write you code here
		while (true) {
			if (number % 2 == 0) {
				number /= 2;
				System.out.print(number + " ");
				counter++;
			} else {
				number = number * 3 + 1;
				System.out.print(number + " ");
				counter++;
			}

			if (number == 1) {
				break;
			}
		}
		/// }

		System.out.println("\nTerminated after " + counter + " steps.");
	}

}
