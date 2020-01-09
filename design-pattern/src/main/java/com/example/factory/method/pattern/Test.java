package com.example.factory.method.pattern;

public class Test {
	public static void main(String[] args) {
		Factory factory = new MilkFactory();
		factory.create().make();
		
		factory = new PhoneFactory();
		factory.create().make();
	}
}
