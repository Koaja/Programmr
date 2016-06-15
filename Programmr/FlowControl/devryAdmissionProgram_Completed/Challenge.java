package devryAdmissionProgram_Completed;

import java.util.Scanner;

class Challenge {

	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		double gpa;
		int sat_score;
		System.out.println("Devry University Admission Program");
		System.out.print("Enter your GPA out of 5:");
		gpa = scanner.nextDouble();
		System.out.print("Enter your SAT Score:");
		sat_score = scanner.nextInt();
		/// { Write you code here
		if (gpa < 1.8 || gpa < 1.8 && sat_score < 900) {
			System.out.println("Your GPA is too low");
		} else if (sat_score < 900) {
			System.out.println("Your SAT score is too low");
		} else {
			System.out.println("You were accepted");
		}
		/// }
	}

}
