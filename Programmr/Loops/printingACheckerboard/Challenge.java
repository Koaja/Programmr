package printingACheckerboard;

import java.util.Scanner;

class Challenge {

	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int input;

		System.out.println("Enter a number");
		input = scanner.nextInt();
		// use a double loop to print it

		/// { write you code here
		for (int i = 0; i < input; i++) {
			if (i % 2 == 0) {
				System.out.print("%_");
			} else {
				System.out.print("_%");
			}
			for (int j = 0; j < input - 1; j++) {
				if (i % 2 == 0) {
					System.out.print("%_");
				} else {
					System.out.print("_%");
				}
			}
			System.out.println();
		}
		/// }

	}

}
