package com.velocity.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Demo1 {

	public static void main(String[] args) {
		List<Employee> employees = new ArrayList<Employee>();
		employees.add(new Employee("Ravi", "Pune", 26, 150000));
		employees.add(new Employee("Vikas", "Mumbai", 27, 160000));
		employees.add(new Employee("Reena", "Nashik", 28, 170000));
		employees.add(new Employee("Veena", "Mumbai", 27, 180000));

		ListIterator<Employee> itr = employees.listIterator();
		while (itr.hasNext()) {
			System.out.print(itr.next());
		}
		
		// Lead
		employees.forEach(e -> System.out.println(e.getEmpName()));

	}

}
