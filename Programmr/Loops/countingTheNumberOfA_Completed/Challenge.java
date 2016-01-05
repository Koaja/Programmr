package countingTheNumberOfA_Completed;

import java.util.Scanner;

class Challenge {

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter String: ");
		String str = sc.nextLine();

		/// { Write your code here

		int count = 0;
		char[] letters = str.toCharArray();
		
		for (int i = 0; i < letters.length; i++) {
			if (letters[i] == 'a') {
				count++;
			}
		}
		/// }

		System.out.println("Number of a's: " + count);

	}

}
