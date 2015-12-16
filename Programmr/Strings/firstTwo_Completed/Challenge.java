package firstTwo_Completed;

import java.util.Scanner;

class Challenge {

	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		String string;
		System.out.println("Enter a string:");
		string = scanner.nextLine();

		/// {Write your code here

		if (string.length() <= 2) {
			System.out.println(string);
		} else if (string.length() > 2) {
			string = string.substring(0, 1) + string.substring(1, 2);
			System.out.println(string);
		}

		/// }

	}

}
