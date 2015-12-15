package hadBad_Completed;

import java.util.Scanner;

class Challenge {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a string:");
		String string = scanner.nextLine();
		/// {write your code here

		if (string.startsWith("bad") || string.substring(1, 4).equals("bad")) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}

		/// }

	}

}