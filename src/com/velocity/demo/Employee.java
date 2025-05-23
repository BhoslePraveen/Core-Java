package com.velocity.demo;

public class Employee {
	private String empName;
	private String address;
	private int age;
	private double salary;

	public Employee(String empName, String address, int age, double salary) {
		super();
		this.empName = empName;
		this.address = address;
		this.age = age;
		this.salary = salary;
	}
	
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [empName=" + empName + ", address=" + address + ", age=" + age + ", salary=" + salary + "]";
	}
}
