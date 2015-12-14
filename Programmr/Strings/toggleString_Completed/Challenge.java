package toggleString_Completed;

import java.util.Scanner;

class Challenge {

	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		String input;

		input = scanner.nextLine();
		String newstr = "";
		/// {write your code here

		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			if (Character.isUpperCase(ch)) {
				ch = Character.toLowerCase(ch);
				newstr = newstr + ch;
			} else {
				ch = Character.toUpperCase(ch);
				newstr = newstr + ch;
			}
		}

		/// }

		System.out.println(newstr);
	}

}