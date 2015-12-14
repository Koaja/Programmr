package removeVowelsFromWords_Completed;

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
		newstr = str.replaceAll("[aeiou]", "");
		/// }

		System.out.println("Edited Word:" + newstr);
	}

}