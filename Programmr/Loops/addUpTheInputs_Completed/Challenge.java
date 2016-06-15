package addUpTheInputs_Completed;

import java.util.Scanner;

class Challenge {

	public static void main(String args[]) {
		int n, sum = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number:");
		/// { write your code here

		while (true) {
			n = scanner.nextInt();
			sum += n;
			if (n == 0) {
				break;
			}
		}

		/// }
		System.out.println("The total is:" + sum);
	}

}
