package addElementsOfAnArray_Completed;

import java.util.Scanner;

class Challenge {

	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int sum = 0;
		int a[];
		a = new int[10];
		System.out.println("Enter elements of array :");
		for (int i = 0; i < 10; i++) {
			a[i] = scanner.nextInt();
			if (i == 9)
				break;
		}

		for (int j= 0; j < a.length; j++){
			sum = sum + a[j];
		}

		System.out.println("Sum of elements of the array:" + sum);
	}

}
