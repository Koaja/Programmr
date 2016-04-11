package sumOfPrimeDigitsInANumber_Completed;

import java.util.Scanner;

class Challenge {

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter String: ");
		String str = sc.nextLine();

		/// { Write your code here
		int count = 0;
		int currentNumber = 0;
		String[] number = str.split("");

		for (int i = 0; i < number.length; i++) {
			try {
				currentNumber = Integer.parseInt(number[i]);
			} catch (NumberFormatException e) {

			}
			if (currentNumber == 2) {
				count += 2;
			}
			for (int j = 2; j < currentNumber; j++) {
				if (currentNumber % j == 0) {
					break;
				} else {
					System.out.println(currentNumber);
					count += currentNumber;
					break;
				}
			}

		}
		/// }

		System.out.println("Sum of prime digits = " + count);
	}

}
