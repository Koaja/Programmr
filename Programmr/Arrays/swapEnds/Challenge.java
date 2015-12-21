package swapEnds;

import java.util.Scanner;

class Challenge {

	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int size = 0;
		System.out.println("Enter size of the array:");
		size = scanner.nextInt();
		int[] array = new int[size];
		System.out.println("Enter integers into the array:");
		for (int i = 0; i < array.length; i++) {
			array[i] = scanner.nextInt();
		}
		/// {write you code here

		/// }
		System.out.println("Printing the array:");
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}

	}

}
