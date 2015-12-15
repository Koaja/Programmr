package rotateLeftByTwo_Completed;

import java.util.Scanner;

class Challenge {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a string:");
		String string = scanner.nextLine();
		/// {write your code here

		string = string.substring(2, string.length()) + string.substring(0, 2);

		System.out.println(string);

		/// }

	}
}
