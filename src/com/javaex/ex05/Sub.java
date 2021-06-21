package com.javaex.ex05;

public class Sub {

	private int a;
	private int b;

	public Sub() {
		super();
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public void setValue(int a, int b) {
	}

	public int calculate() {
		return a / b;
	}

}
