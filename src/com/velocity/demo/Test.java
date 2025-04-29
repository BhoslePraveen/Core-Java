package com.velocity.demo;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		List<Employee> employees = new ArrayList<Employee>();
		employees.add(new Employee("Ravi", "Pune", 26, 150000));
		employees.add(new Employee("Vikas", "Mumbai", 27, 160000));
		employees.add(new Employee("Reena", "Nashik", 28, 170000));

		for (Employee emp : employees) {
			System.out.println(emp);
		}

	}

}
