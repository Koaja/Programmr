package decodingURL_Completed;

import java.util.Scanner;

class Challenge {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the URL :");
		String s = sc.nextLine();

		Challenge obj = new Challenge();
		s = obj.decodeURL(s);
		System.out.print("Decoded URL is :" + s);
	}

	// {write your code here
	public String decodeURL(String s) {
		if (s.contains("%20")) {
			return s = s.replace("%20", " ");
		} else if (s.contains("%3A")) {
			return s = s.replace("%3A", "?");
		} else {
			return s = s.replace("%3D", ".");
		}
	}
	// }
}