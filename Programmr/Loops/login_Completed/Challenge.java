package login_Completed;

import java.util.Scanner;

class Challenge {

	public static void main(String args[]) {
		Scanner i = new Scanner(System.in);

		String user[] = new String[3];
		String pass[] = new String[3];

		user[0] = "John";
		user[1] = "Bob";
		user[2] = "ArnoldSchwarzenegger";

		pass[0] = "123";
		pass[1] = "456";
		pass[2] = "theterminator";

		System.out.println("Enter username:");
		String username = i.next();
		System.out.println("Enter pasword:");
		String password = i.next();

		/// { write you code here

		boolean match = false;

		for (int j = 0; j < user.length; j++) {
			if (username.equals(user[j]) && password.equals(pass[j])) {
				match = true;
				break;
			}
		}

		if (match) {
			System.out.println("Hello " + username + "!");
		} else {
			System.out.println("Incorrect Login!");
		}

		// if (username.equals(user[0]) && password.equals(pass[0]) ||
		// username.equals(user[1]) && password.equals(pass[1])
		// || username.equals(user[2]) && password.equals(pass[2])) {
		// System.out.println("Hello " + username + "!");
		// } else {
		// System.out.println("Incorrect Login!");
		// }

		/// }

	}

}
