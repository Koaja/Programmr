package stringTimes_Completed;

import java.util.Scanner;

class Challenge {

	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int n = 0;
		String str = "", strng = "";
		System.out.println("Enter a string:");
		str = scanner.nextLine();
		System.out.println("How many times?:");
		n = scanner.nextInt();
		strng = stringTimes(str, n);
		System.out.println("stringTimes:" + strng);
	}

	public static String stringTimes(String str, int n) {
		/// {write your code here
		String result = "";

		for (int i = 0; i < n; i++) {
			result = result + str;
		}
		/// }
		return result;
	}

}
