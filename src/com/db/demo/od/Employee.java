package com.db.demo.od;

public class Employee {

	private Integer id;
	private String name;
	private Double salary;

	public Employee() {
		super();
	}

	public Employee(Integer id, String name, Double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
}
