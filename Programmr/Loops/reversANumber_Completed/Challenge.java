package reversANumber_Completed;

import java.util.Scanner;

class Challenge {

	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int rnum = 0;

		System.out.println("Enter the number:");
		int num = scanner.nextInt();

		/// {write you code here

		String x = String.valueOf(num);

		String[] y = x.split("");

		String reverse = "";

		for (int i = y.length - 1; i >= 0; i--) {
			reverse = reverse + y[i];
		}

		rnum = Integer.parseInt(reverse);
		/// }

		System.out.println("Reverse is :" + rnum);
	}

}