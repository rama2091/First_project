package org.practice;

public class Employee {
	public void empName() {
		System.out.println("ram");
	}
	public void empId() {
		System.out.println("12345");
	}
	public static void main(String[] args) {
		Employee employee=new Employee();
		employee.empName();
		employee.empId();	
	}
}
