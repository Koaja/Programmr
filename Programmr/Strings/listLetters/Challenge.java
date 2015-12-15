package listLetters;

import java.util.Scanner;

class Challenge {

	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);

		String str;
		int count = 0;
		char letter;

		System.out.println("Please type in a line of text:");
		/// {Write your code here
		System.out.println("Your input contains the following letters: ");

		str = scanner.nextLine().toUpperCase();
		for (int i = 0; i < str.length(); i++) {
			letter = str.charAt(i);
			for (int j = 0; i < str.toCharArray().length; i++) {

			}
		}

		/// }

		System.out.println("There were " + count + " different letters.");
	}

}
