package longestWord_Completed;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Challenge {

	public static void main(String[] args) throws IOException {
		System.out.println("Enter a sentence:");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s1 = br.readLine();
		String longestWord = "";
		String[] words = s1.split(" ");

		for (int i = 0; i < words.length; i++) {

			System.out.println("first: " + longestWord);

			if (longestWord.length() > words[i].length()) {
				longestWord = longestWord;
			} else {
				longestWord = words[i];
			}
			System.out.println("second: " + longestWord);
		}

		/// {Enter your code here

		/// }
		System.out.println("The longest word in the sentence is:" + longestWord);
	}
}
