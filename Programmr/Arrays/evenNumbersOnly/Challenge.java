package evenNumbersOnly;

import java.util.Scanner;

class Challenge {

	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int[] arr = new int[5];
		int num;
		/// { write your code here

		for (int i = 0; i < arr.length; i++) {
			arr[i] = scanner.nextInt();
		}

		for (int j = 0; j < arr.length; j++) {
			if (arr[j] % 2 == 0) {
				System.out.println(arr[j]);
			}
			if (arr[j] % 2 != 0) {
				System.out.println("Even numbers not found in array");
			}
		}
		/// }

	}

}
