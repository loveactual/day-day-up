package com.example.simple.factory.pattern;

public class Test {

	public static void main(String[] args) {
		Factory.create("milk").make();
		Factory.create("phone").make();
		Factory.create("car").make();
	}

}
