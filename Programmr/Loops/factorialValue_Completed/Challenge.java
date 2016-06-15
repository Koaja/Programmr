package factorialValue_Completed;

import java.util.Scanner;

class Challenge {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Input:");
		int number = sc.nextInt();
		int factorialValue = number;
		/// { write you code here

		while (number > 0) {
			number--;
			if (number == 0) {
				break;
			}
			factorialValue *= number;
		}

		/// }

		System.out.println("Factorial of the number is : " + factorialValue);
	}

}
