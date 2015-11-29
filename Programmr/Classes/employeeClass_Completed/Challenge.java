package employeeClass_Completed;

import java.util.Scanner;

public class Challenge {
	
	 public static void main(String args[]){
		 Scanner scanner=new Scanner(System.in);
		 System.out.println("Enter first name:");
		 String first = scanner.nextLine();
		 System.out.println("Enter last name:");
		 String last = scanner.nextLine();
		 System.out.println("Enter monthly salary:");
		 double salary = scanner.nextDouble();
		 Employee e1 = new Employee(first,last,salary);
		 
		 System.out.println("First name:"+e1.getFirstName());
		 System.out.println("Last name:"+e1.getLastName());
		 System.out.println("Salary:"+e1.getSalary());
		 
		 }

}
