package com.javaex.ex06;

public class PointApp {

	public static void main(String[] args) {
		
		Point p1 = new Point(2, 3);
		Point p2 = new Point(2, 3);
		Point p3 = new Point(5, 3);
		Point p4 = p1;
		
		System.out.println(p1 == p2);
		System.out.println(p2 == p3);
		System.out.println(p3 == p4);
		System.out.println(p4 == p1);		
		System.out.println(p1.equals(p2));
		System.out.println(p4.equals(p1));
	}

}


	/*
	 “==” 비교 연산자는 비교하고자 하는 두 개의 주소 값을 비교한다.
	 equals() 메소드는 비교하고 하는 두 개의 대상의 내용 자체를 비교 즉 데이터 값을 비교한다.
	 */

