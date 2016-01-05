package convertUpperToLowerCase_Completed;

import java.util.Scanner;

class Challenge {

	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter an alphabet:");
		String input;

		input = scanner.next();
		input = lowerCase(input);
		System.out.println(input);
	}

	public static String lowerCase(String x) {
		/// {Write your code here
		if(x == x.toUpperCase()){
			return x = x.toLowerCase();
		}else {
			return x;
		}
		/// }
	}

}
