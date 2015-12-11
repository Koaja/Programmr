package changingUppercasetoLowercase_Completed;

import java.util.Scanner;

class Challenge {

	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter an Uppercase letter:");

		/// { Write your code here
		String upperCase = scanner.nextLine();

		System.out.println("Output: ");

		String lowerCase = upperCase.toLowerCase();
		System.out.println(lowerCase);
		/// }
	}
}