package com.javaex.ex01;

import java.util.ArrayList;
import java.util.List;

public class UserApp {

	public static void main(String[] args) {
		
		List uList=new ArrayList();
		
		Customer c1=new Customer("jung-ws", "j1357913579", "정우성", 1000);
		Customer c2=new Customer("LEEHR", "a123!!", "이효리", 2500);
		Customer c3=new Customer("me-park", "y2345", "박명수", 1200);
		
		Staff s1=new Staff("master", "m7788", "운영자", 3500000);
		
		uList.add(s1);
		uList.add(c1);
		uList.add(c2);
		uList.add(c3);
		
		for (int i=0; i<uList.size(); i++) {
			System.out.println((i+1)+"."+uList.get(i).toString());
		}
		
		System.out.println("");
		System.out.println("운영자의 연봉은 "+s1.getSalary()*12+" 입니다.");
		

	}

}
