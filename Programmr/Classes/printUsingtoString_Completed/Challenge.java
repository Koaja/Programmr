package printUsingtoString_Completed;

import java.util.Scanner;

public class Challenge {

	/// { Write your code here
	static String name;
	static String age;

	public Challenge(String name, String age) {
		this.name = name;
		this.age = age;
	}

	/// }
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the name:");
		String name = scanner.next();
		System.out.print("Enter the age:");
		String age = scanner.next();

		Challenge test = new Challenge(name, age);
		System.out.println(test);

	}

	public String toString() {
		return ("Name=>" + name + " and " + "Age=>" + age);
	}
}
