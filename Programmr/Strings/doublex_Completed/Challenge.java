package doublex_Completed;

import java.util.Scanner;

class Challenge {

	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		String str = "";
		boolean r;
		System.out.println("Enter a string of ur choice:");
		str = scanner.nextLine();
		r = doublex(str);
		System.out.println("doublex? :" + r);
	}

	static boolean doublex(String str) {
		int firstX = str.indexOf('x');
		System.out.println(firstX);
		System.out.println(str.substring(firstX + 1, firstX + 2));
		/// {write your code here
		if (str.substring(firstX + 1, firstX + 2).equals("x")) {
			return true;
		}

		return false;
		/// }

	}

}