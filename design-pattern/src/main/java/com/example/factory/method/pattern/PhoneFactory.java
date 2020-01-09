package com.example.factory.method.pattern;

public class PhoneFactory implements Factory {

	@Override
	public Product create() {
		return new Phone();
	}

}
