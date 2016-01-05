package backArrayThon;

import java.util.Scanner;

class Challenge {

	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int element[] = new int[10];
		int i, r = 0;
		System.out.println("Enter size of array:");
		r = scanner.nextInt();
		System.out.println("Enter " + r + " integers to fill an array:");
		for (i = 0; i < r; i++) {
			element[i] = scanner.nextInt();
		}
		System.out.println("Array printed backwards:");
		
		/// {write you code here

		for(int j = r-1; j >= 0;j--){
			System.out.println("element " + "[" + j + "]" + " is:" + element[j]);
		}
		
		/// }
	}

}
