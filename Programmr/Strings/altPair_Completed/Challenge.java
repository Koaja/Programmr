package altPair_Completed;

import java.util.Scanner;

class Challenge {

	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter a string:");
		String str = scanner.nextLine();
		System.out.println(altPairs(str));

	}

	/// {write you code here
	public static String altPairs(String str) {
		int x = 0;

		String newstr = "";
		for (int i = 0; i <= str.length(); i++) {
			if (x < str.length() && x + 1 < str.length()) {
				newstr = newstr + str.charAt(x) + str.charAt(x + 1);
			} else if (x + 1 <= str.length()) {
				newstr = newstr + str.charAt(x);
			}

			x += 4;
		}

		return newstr;
	}

	/// }
}
