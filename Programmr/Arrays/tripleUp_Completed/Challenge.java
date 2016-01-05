package tripleUp_Completed;

import java.util.Scanner;

class Challenge {

	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int count = 0;
		System.out.println("Enter values into the array:");
		int[] array = new int[5];
		for (int i = 0; i < 5; i++) {
			array[i] = scanner.nextInt();
		}
		/// {write you code here
		for (int i = 0; i <= array.length; i++) {
			if (array[i] == (array[i + 1] - 1) && array[i + 1] == (array[i + 2] - 1)) {
				System.out.println(true);
				break;
			} else {
				System.out.println(false);
			}
		}

		/// }
	}
}
