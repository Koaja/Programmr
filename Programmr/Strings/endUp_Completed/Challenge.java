package endUp_Completed;

import java.util.Scanner;

class Challenge {

	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a string:");
		String s = scanner.next();
		/// {write you code here

		if (s.length() < 3) {
			s = s.toUpperCase();
		} else {
			String s1 = s.substring(s.length() - 3, s.length()).toUpperCase();
			s = s.substring(0, s.length() - 3) + s1;
		}
		System.out.println(s);

		/// }

	}

}
