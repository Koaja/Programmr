package table_Completed;

import java.util.Scanner;

class Challenge {

	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter a number:");
		int num1 = scanner.nextInt();
		System.out.println("Enter number of multiples:");
		int num2 = scanner.nextInt();

		/// {write you code here

		for (int i = 1; i <= num2; i++) {
			System.out.println(num1 + "*" + i + "=" + num1 * i);
		}

		/// }

	}

}
