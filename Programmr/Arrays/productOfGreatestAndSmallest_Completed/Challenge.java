package productOfGreatestAndSmallest_Completed;

import java.util.Scanner;

class Challenge {

	public static void main(String args[]) throws InterruptedException {
		Scanner scanner = new Scanner(System.in);
		int sum = 0;
		int a[];
		int max = 0, min = 0;
		a = new int[10];
		System.out.println("Enter elements of array :");
		for (int i = 0; i < 10; i++) {
			a[i] = scanner.nextInt();
			if (i == 9)
				break;
		}
		/// {write you code here

		// max
		for (int j = 0; j < a.length - 1; j++) {
			if (a[j] <= a[j + 1]) {
				int temp = a[j + 1];
				if (temp > max) {
					max = temp;
				}
			}

		}

		// min
		for (int k = 0; k < a.length - 1; k++) {
			if (a[k] > a[k + 1]) {
				int temp2 = a[k+1];
				if (temp2 < min) {
					min = temp2;
				}
			}
		}

		/// }
		System.out.println("final max: " + max);
		System.out.println("final min: " + min);
		System.out.println("Result is :" + (max * min));
	}
}