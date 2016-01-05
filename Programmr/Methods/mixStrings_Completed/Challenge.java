package mixStrings_Completed;

import java.util.Scanner;

class Challenge {

	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter first string:");
		String str1 = scanner.nextLine();
		System.out.println("Enter second string:");
		String str2 = scanner.nextLine();
		System.out.println(mixString(str1, str2));
	}
	/// {write you code here
	public static String mixString(String str1, String str2){
		String text = "";
		
		for(int i = 0; i <= str1.length() -1; i++){
			text = text + str1.charAt(i) + str2.charAt(i);
		}
		return text;
	}
	/// }

}
