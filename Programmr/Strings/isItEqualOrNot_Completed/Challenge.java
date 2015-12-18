package isItEqualOrNot_Completed;

import java.util.Scanner;

class Challenge {

	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a string:");
		String string = scanner.nextLine();
		System.out.println(equalIsNot(string));
	}

	public static boolean equalIsNot(String str) {

		/// {write you code here
		int countIs = 0;
		int countNot = 0;

		String[] array = str.split(" ");

		for (int i = 0; i < array.length; i++) {
			String word = array[i];
			for (int j = 0; j < array[i].length() - 1; j++) {
				if (word.charAt(j) == 'i' && word.charAt(j + 1) == 's') {
					countIs++;
				} else if (word.charAt(j) == 'n' && word.charAt(j + 1) == 'o' && word.charAt(j + 2) == 't') {
					countNot++;
				}
			}
		}

		if (countIs != countNot) {
			return false;
		} else {
			return true;
		}
		/// }

	}
}