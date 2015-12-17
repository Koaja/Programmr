package isItEqualOrNot;

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
			for (int j = 0; j < array[i].length(); j++) {
				if (array[i].charAt(j) == 'i' && array[i].charAt(j + 1) == 's') {
					countIs++;
				} else if (array[i].charAt(j) == 'n' && array[i].charAt(j + 1) == 'o'
						&& array[i].charAt(j + 2) == 't') {
					countNot++;
				}
			}
		}
		System.out.println("is:" + countIs);
		System.out.println("not: " + countNot);
		if (countIs != countNot) {
			return false;
		} else {

			return true;
		}
		/// }

	}
}