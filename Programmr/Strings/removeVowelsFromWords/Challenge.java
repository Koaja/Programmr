package removeVowelsFromWords;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Challenge {

	public static void main(String args[]) throws IOException {
		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(is);
		String newstr = "";
		char vowel[] = { 'a', 'e', 'i', 'o', 'u' };
		char ch = ' ';

		System.out.println("Enter the Word:");
		String str = br.readLine();

		/// {write your code here
		for (int i = 0; i < str.length(); i++) {
			ch = str.charAt(i);
			for (int j = 0; j < vowel.length; j++) {
				if (ch == vowel[j]) {
					newstr = str.substring(str.indexOf(ch), str.length());
				}
			}

		}
		/// }

		System.out.println("Edited Word:" + newstr);
	}

}