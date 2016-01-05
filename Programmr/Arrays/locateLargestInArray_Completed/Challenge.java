package locateLargestInArray_Completed;

import java.util.Scanner;

class Challenge {
	public static void main(String[] args) {
		int[] a = new int[10];
		int maxPos = 0;
		int elemLocation = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array values:");
		/// {write your code here
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		System.out.print("Array: ");
		for (int j : a) {
			System.out.print(j + " ");
		}

		for (int i = 0; i < a.length - 1; i++) {
			if (a[i] > a[i + 1]) {
				int temp = a[i];
				if(temp > maxPos){
					maxPos = temp;
					elemLocation = i;
				}
			}
		}
		System.out.println();
		System.out.println("The Largest Element is: " + maxPos);
		System.out.println("It's at location: " + elemLocation);
		/// }
	}
}
