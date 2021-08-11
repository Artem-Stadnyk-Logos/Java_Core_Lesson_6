package com.lgs.lab.interface2;

import com.lgs.lab.interface1.Numerable;

public class MyCalculator implements Numerable {
	
	public void Devide1() {

		int a = 20;
		int b = 2;

		int c = a / b;
		System.out.println(c);

	}

	public void Minus1() {
		int a = 15;
		int b = 5;

		int c = a - b;
		System.out.println(c);

	}

	public void Multiply1() {
		int a = 5;
		int b = 2;

		int c = a * b;
		System.out.println(c);

	}

	public void Plus1() {
		int a = 5;
		int b = 5;

		int c = a + b;
		System.out.println(c);

	}

}
