package replacer_Completed;

import java.util.Scanner;

class Challenge {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string:");
		String s = sc.nextLine();

		System.out.print("Enter the character to be replaced:");
		String c = sc.nextLine();

		System.out.print("Enter the substitute character:");
		String r = sc.nextLine();

		/// {write you code here
		System.out.println(s.replace(c, r));
		/// }

	}

}