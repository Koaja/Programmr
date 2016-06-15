package sleep;

import java.util.Scanner;

class Challenge {

	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Is it a weekday today?(true or false):");
		boolean w = scanner.nextBoolean();
		System.out.print("Are you on a vacation?(true or false):");
		boolean v = scanner.nextBoolean();
		/// {write you code here
		if (w == false && v == true) {
			System.out.println("You can sleep");
		} else if (w && v == false) {
			System.out.println("You cannot sleep");
		}
		/// }

	}

}
