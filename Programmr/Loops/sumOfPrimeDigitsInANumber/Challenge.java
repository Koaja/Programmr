package sumOfPrimeDigitsInANumber;

import java.util.Scanner;

class Challenge {

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter String: ");
		String str = sc.nextLine();

		/// { Write your code here
		int count = 2;

		String[] number = str.split("");

		for (int i = 0; i < number.length; i++) {
			int currentNumber = Integer.parseInt(number[i]);
			if (currentNumber % 2 != 0 && i % 3 != 0 && i % 5 != 0 && i % 7 != 0) {
				System.out.println(currentNumber);
				count = count + currentNumber;
			}

		}
		/// }

		System.out.println("Sum of prime digits = " + count);
	}

}
