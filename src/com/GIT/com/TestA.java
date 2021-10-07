package com.GIT.com;

public class TestA {

	static int  x=10;
	
	public static void main(String[] args) {
		
		
		TestA t1 = new TestA();
		
		TestA t2  = new TestA();
		t1.x=20;
		
		System.out.println(t1.x);
		System.out.println(t2.x);
	}
	
	
}
