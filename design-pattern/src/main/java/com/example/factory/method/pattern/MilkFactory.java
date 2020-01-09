package com.example.factory.method.pattern;

public class MilkFactory implements Factory {

	@Override
	public Product create() {
		return new Milk();
	}

}
