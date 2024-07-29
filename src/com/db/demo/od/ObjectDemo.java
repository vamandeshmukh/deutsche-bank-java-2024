package com.db.demo.od;

public class ObjectDemo {
	
	public static void main(String[] args) {
		
		Employee emp1 = new Employee(101, "Sonu", 90.75);
		Employee emp2 = new Employee(101, "Sonu", 90.75);
		
		System.out.println(emp1.hashCode());
		System.out.println(emp2.hashCode());
	
	}

}
