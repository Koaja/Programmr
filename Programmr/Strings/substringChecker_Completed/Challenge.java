package substringChecker_Completed;

import java.util.Scanner;

class Challenge {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter first string:");
		String s = sc.nextLine();
		System.out.print("Enter second string:");
		String sub = sc.next();
		/// {write you code here
		if (s.contains(sub)) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
		/// }

	}

}
