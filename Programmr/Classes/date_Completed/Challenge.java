package date_Completed;

import java.util.Scanner;

public class Challenge {

	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter day:");
		int day = scanner.nextInt();
		System.out.println("Enter month:");
		int month = scanner.nextInt();
		System.out.println("Enter year:");
		int year = scanner.nextInt();
		Date d = new Date(day, month, year);
		d.displayDate();
	}
}
