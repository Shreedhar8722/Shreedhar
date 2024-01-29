package com.tnsif.day5;

public class Employee {
	private String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	private String dept;
	private int salary;
	private int id;
	private int age;
	@Override
	public String toString() {
		return "Employee [name=" + name + ", dept=" + dept + ", salary=" + salary + ", id=" + id + ", age=" + age + "]";
	}

	
	

}
