package com.velocity.demo;

import java.util.ArrayList;

public class Test1 {

	public static void main(String[] args) {
		ArrayList<Student> list = new ArrayList<Student>();
		list.add(new Student(101, "Vishal", "11", "Pune"));
		list.add(new Student(102, "Abhay", "11", "Mumbai"));
		list.add(new Student(103, "Depali", "11", "Bangalore"));
		
		System.out.println(list);

	}

}
