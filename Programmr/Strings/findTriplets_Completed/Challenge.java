package findTriplets_Completed;

import java.util.Scanner;

public class Challenge {

	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a string:");
		String string = scanner.nextLine();
		System.out.println(countTriplets(string));
	}

	/// {write your code here
	public static int countTriplets(String str) {
		int count = 0;
		for (int i = 1; i < str.length(); i++) {
			if (str.charAt(i - 1) == str.charAt(i) && str.charAt(i) == str.charAt(i + 1)) {
				count++;
			}
		}
		return count;
	}
	/// }
}
