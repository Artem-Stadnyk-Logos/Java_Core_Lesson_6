package com.lgs.lab.interface1;

public interface Numerable extends Devide, Multiply, Minus, Plus{

	 default void allmethods() {
			Devide1();
			Minus1();
			Multiply1();
			Plus1();

		}
}