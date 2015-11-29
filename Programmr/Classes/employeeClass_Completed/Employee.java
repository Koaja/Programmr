package employeeClass_Completed;

public class Employee {

	String firstName;
	String lastName;
	double salary;

	Employee(String firstName, String lastName, double salary) {
		this.salary = salary;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getFirstName() {
		return this.firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getLastName() {
		return this.lastName;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public double getSalary() {
		if (salary <= 0)
			return this.salary = 0;
		else
			return this.salary = salary;
	}
}
