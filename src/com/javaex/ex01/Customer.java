package com.javaex.ex01;

public class Customer extends User {
	
	private int point;

	public Customer() {
	}
	public Customer(int point) {
		this.point = point;
	}
	
	public int getPoint() {
		return point;
	}
	public void setPoint(int point) {
		this.point = point;
	}
	
	@Override
	public String toString() {
		return "Customer [point=" + point + "]";
	}

}
