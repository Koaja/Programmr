package shareDigit_Completed;

import java.util.Scanner;

class Challenge {

	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the 1st number:");
		int num1 = scanner.nextInt();
		System.out.println("Enter the 2nd number:");
		int num2 = scanner.nextInt();
		System.out.println(shareDigit(num1, num2));
	}
	/// {write you code here

	public static boolean shareDigit(int num1, int num2) {

		if (num1 % 10 == num2 % 10 || num1 % 10 == num2 / 10) {
			return true;
		} else if (num1 / 10 == num2 % 10 || num1 / 10 == num2 / 10) {
			return true;
		}

		return false;
	}

	/// }

}
