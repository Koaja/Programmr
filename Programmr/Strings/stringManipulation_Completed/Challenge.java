package stringManipulation_Completed;

import java.util.Scanner;

class Challenge {

	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		String s = "";
		System.out.println("Enter String:");
		s = scanner.nextLine();
		/// {write your code here
		String upper = s.toUpperCase();
		String lower = s.toLowerCase();
		int num = s.length();
		/// }

		System.out.println(upper);
		System.out.println(lower);
		System.out.println(num);

	}

}