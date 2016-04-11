package mixStrings_Completed;

import java.util.Scanner;

class Challenge {

	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter first string:");
		String str1 = scanner.nextLine();
		System.out.println("Enter second string:");
		String str2 = scanner.nextLine();
		System.out.println(mixString(str1, str2));
	}

	/// {write you code here
	public static String mixString(String str1, String str2) {
		String text = "";
		String leftover = "";

		int lenght1 = str1.length();
		int lenght2 = str2.length();
		int smallest = 0;

		if (lenght1 < lenght2) {
			leftover = str2.substring(lenght1);
		} else {
			leftover = str1.substring(lenght2);
		}

		if (lenght1 < lenght2) {
			smallest = lenght1;
		} else {
			smallest = lenght2;
		}

		for (int i = 0; i < smallest; i++) {
			text = text + str1.charAt(i) + str2.charAt(i);
		}

		return text += leftover;
	}
	/// }

}
