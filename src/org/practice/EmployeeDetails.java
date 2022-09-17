package org.practice;
//parent class
public class EmployeeDetails extends EmployeeInfo {
	public void empDob() {
		System.out.println("28/09/1995");
	}
	
	public static void main(String[] args) {
		EmployeeDetails employee=new EmployeeDetails();
		employee.empName();
		employee.empId();	
		employee.empAge();
		employee.empDob();
	}
}



