package compareToChallenge_Completed;

import java.util.Scanner;

class Challenge {

	public static void main(String args[]) {
		String s1, s2;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the first string:");
		s1 = scanner.nextLine();

		System.out.println("Enter the second string:");
		s2 = scanner.nextLine();
		int c;
		/// {write you code here
		c = s1.compareTo(s2);

		if (c == 0) {
			System.out.println("Both string are equal");
		} else {
			System.out.println(c);
		}
		/// }

	}

}