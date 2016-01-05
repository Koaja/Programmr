package reverseAStringUsingArray;

import java.util.Scanner;

class Challenge {

	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int sum = 0;

		System.out.print("Enter a string:");
		String s = scanner.next();

		char[] str = s.toCharArray();

		int len = str.length;
		/// {Write your code here
		for (int i = len -1; i >= sum; i--) {
			System.out.print(str[i]);
		}
		/// }
		System.out.println();
		System.out.println(str);
	}

}