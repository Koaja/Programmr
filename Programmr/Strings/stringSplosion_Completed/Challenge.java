package stringSplosion_Completed;

import java.util.Scanner;

class Challenge {

	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		String str = null, strng = "";
		System.out.println("Enter a string for stringSplosion:");
		str = scanner.nextLine();
		strng = stringSplosion(str);
		System.out.println("here it is :" + strng);
	}

	public static String stringSplosion(String str) {
		/// {Write your code here
		String result = "";
		for (int i = 0; i <= str.length(); i++) {
			result = result + str.substring(0, i);
		}
		/// }
		return result;
	}

}