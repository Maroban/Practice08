package com.javaex.ex05;

import java.util.Scanner;

public class CalcApp {

	public static void main(String[] args) {

		Add add = new Add();
		Div div = new Div();
		Mul mul = new Mul();
		Sub sub = new Sub();

		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.print(">> ");
			String value = sc.nextLine();

			if (value.equals("/q")) {
				System.out.println("종료합니다.");
				break;
			}

			String[] add01 = value.split(" ");
			int a = Integer.parseInt(add01[0]);
			int b = Integer.parseInt(add01[2]);

			if (value.contains("+")) {
				add.setA(a);
				add.setB(b);
				System.out.println(add.calculate());

			} else if (value.contains("-")) {
				div.setA(a);
				div.setB(b);
				System.out.println(div.calculate());

			} else if (value.contains("*")) {
				mul.setA(a);
				mul.setB(b);
				System.out.println(mul.calculate());

			} else if (value.contains("/")) {
				sub.setA(a);
				sub.setB(b);
				System.out.println(sub.calculate());

			} else {
				System.out.println("알 수 없는 연산입니다.");
			}

		}
		sc.close();
	}
}
