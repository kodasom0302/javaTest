package com.javaex.ex01;

public class Staff extends User {
	
	private int salary;

	public Staff() {
	}
	public Staff(int salary) {
		this.salary = salary;
	}
	
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	@Override
	public String toString() {
		return "Staff [salary=" + salary + "]";
	}

}
