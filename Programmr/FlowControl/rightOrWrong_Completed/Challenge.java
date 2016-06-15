package rightOrWrong_Completed;

import java.util.Scanner;

class Challenge {

	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("What is 12+12?");
		/// {write you code here
		int answer = scanner.nextInt();
		if (answer == 24) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}

		/// }

	}

}
