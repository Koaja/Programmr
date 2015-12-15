package firstHalfWithSecondHalf_Completed;

import java.util.Scanner;

class Challenge {

	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		String x;

		/// { write your code here
		System.out.println("x :");
		x = scanner.nextLine();

		if (x.length() % 2 == 0) {
			x = x.substring(x.length() / 2) + x.substring(0, x.length() / 2);
		} else if (x.length() % 2 != 0) {
			x = x.substring(x.length() / 2) + x.substring(0, x.length() / 2);
		} else if (x.length() == 1) {
			x = x;
		}

		System.out.println(x);
		/// }
	}

}
