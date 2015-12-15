package bobThere_Completed;

import java.util.Scanner;

class Challenge {

	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a string:");
		String string = scanner.nextLine();

		/// {write your code here
		int firstB = string.indexOf('b');
		char[] ch = string.toCharArray();

		for (int i = 0; i < string.length(); i++) {
			if (string.substring(firstB + 2, firstB + 3).equals("b")) {
				System.out.println("True");
			}
		}

		/// }

	}

}
