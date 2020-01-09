package com.example.simple.factory.pattern;

public class Phone implements Product{

	@Override
	public void make() {
		System.out.println("make phone");
	}

}
