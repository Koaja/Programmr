package frontAgain_Completed;

import java.util.Scanner;

class Challenge {

	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a string:");
		String s = scanner.next();
		int l = s.length();
		System.out.println(l);
		/// {write you code here
		if (s.substring(0, 1).equals(s.substring(l - 2, l - 1))) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
		/// }

	}

}