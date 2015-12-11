package findLengthOfTheString_Completed;

import java.util.Scanner;

class Challenge {

	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter a string:");
		/// {Write your code here
		String string = scanner.nextLine();
		int length = string.length();
		/// }
		System.out.println("Length of the string is:" + length);

	}

}
