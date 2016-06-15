package countingMachine;

import java.util.Scanner;

class Challenge {

	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Count to: ");
		int number = scanner.nextInt();

		/// {write you code here
		for (int i = 0; i <= number; i++) {
			System.out.print(i + " ");
		}
		/// }

	}

}
