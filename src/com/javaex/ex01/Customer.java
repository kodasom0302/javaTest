package com.javaex.ex01;

public class Customer extends User {
	
	private int point;

	public Customer() {
	}
	public Customer(String id, String pw, String name, int point) {
		super(id, pw, name);
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
		return "아이디:"+id+" 비번:"+pw+" 이름:"+name+" 포인트:"+point;
	}

}
