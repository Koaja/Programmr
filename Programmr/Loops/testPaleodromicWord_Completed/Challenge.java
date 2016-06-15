package testPaleodromicWord_Completed;

import java.util.Scanner;

class Challenge {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string:");
		String s = sc.next();
		boolean flag = true;

		/// {write you code here
		String k = "";
		for (int i = 0; i < s.length(); i++) {
			k = s.substring(i, i + 1) + k;
		}

		if (!k.equals(s)) {
			flag = false;
		}
		/// }

		if (flag) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}

}
