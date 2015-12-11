package palindromeCheck_Completed;

import java.util.Scanner;

class Challenge {

	public static void main(String args[]) throws InterruptedException {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a line of text: ");
		String line = sc.nextLine();

		StringBuilder reverse = new StringBuilder("");
		// { Write your code here
		// Start
		for (int i = 1; i <= line.length(); i++) {
			char letterExtract = line.charAt(line.length() - i);
			reverse.append(letterExtract);
			Thread.sleep(700);
			System.out.println(reverse);
		}

		if (line.equals(reverse.toString())) {
			System.out.println("Entered string is a palindrome.");
		} else {
			System.out.println("Entered string is not a palindrome.");
		}
		/// }
		// end

	}
}
