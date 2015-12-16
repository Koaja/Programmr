package sumNumber_Completed;

import java.util.Scanner;

class Challenge {

	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a string:");
		String string = scanner.nextLine();
		System.out.println("Sum:" + sumNumbers(string));
	}
	/// {write your code here

	public static int sumNumbers(String str) {
		String[] array = str.split("[a-zA-Z]");
		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			try {
				sum += Integer.parseInt(array[i]);
			} catch (NumberFormatException e) {

			}
		}
		return sum;
	}

	/// }
}