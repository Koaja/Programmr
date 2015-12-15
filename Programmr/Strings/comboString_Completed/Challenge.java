package comboString_Completed;

import java.util.Scanner;

class Challenge {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a string:");
		String string1 = scanner.nextLine();
		System.out.println("Enter another string:");
		String string2 = scanner.nextLine();

		/// {write you code here

		if (string1.length() > string2.length()) {
			string1 = string2 + string1 + string2;
			System.out.println(string1);
		} else {
			string2 = string1 + string2 + string1;
			System.out.println(string2);
		}

		/// }
	}
}
