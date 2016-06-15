package noMultiplesOf3_4_Completed;

import java.util.Scanner;

class Challenge {

	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number:");

		int input = scanner.nextInt();

		/// {Write your code here

		for (int i = 0; i <= input; i++) {
			if (i % 3 != 0 && i % 4 != 0) {
				System.out.println(i);
			}
		}

		/// }
	}

}
