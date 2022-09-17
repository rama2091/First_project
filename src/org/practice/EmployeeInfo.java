package org.practice;
//child class2
public class EmployeeInfo extends Employee {
	public void empAge() {
		System.out.println("28");
	}
	
	public static void main(String[] args) {
		EmployeeInfo employee=new EmployeeInfo();
		employee.empName();
		employee.empId();	
		employee.empAge();
	}
}
