package changeCase_Completed;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Challenge {

	public static void main(String args[]) throws IOException {
		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(is);
		String newstr = "";
		char ch = ' ';

		System.out.println("Enter the Word:");
		String str = br.readLine();

		/// {write your code here
		for (int i = 0; i < str.length(); i++) {
			ch = str.charAt(i);
			if (Character.isUpperCase(ch)) {
				ch = Character.toLowerCase(ch);
			} else {
				ch = Character.toUpperCase(ch);
			}
			newstr = newstr + ch;

		}
		/// }

		System.out.println("Edited Word:" + newstr);
	}

}
