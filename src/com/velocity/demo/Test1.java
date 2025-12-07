package com.velocity.demo;

import java.util.ArrayList;
import java.util.List;

public class Test1 {

	public static void main(String[] args) {
		List<Student> students = new ArrayList<Student>();
		students.add(new Student(101, "Vishal", "11", "Pune"));
		students.add(new Student(102, "Abhay", "11", "Mumbai"));
		students.add(new Student(103, "Depali", "11", "Bangalore"));

		for (Student stu : students) {
			System.out.println(stu);
		}

	}

}
