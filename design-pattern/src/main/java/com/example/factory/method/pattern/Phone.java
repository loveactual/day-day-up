package com.example.factory.method.pattern;

public class Phone implements Product{

	@Override
	public void make() {
		System.out.println("make phone");
	}

}
