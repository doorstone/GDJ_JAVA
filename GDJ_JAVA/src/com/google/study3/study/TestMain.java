package com.google.study3.study;

public class TestMain {
	public static void main(String[]args) {
		Test test = null;
		test = new Test();
		test.t1();
		int n =10;
		test.t2(n, 20);
		Human human = new Human();
		human.age = 20;
		test.t3(human);//인자
		
		
	}

}
