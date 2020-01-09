package com.example.simple.factory.pattern;

public class Factory {
	public static Product create(String name) {
		switch (name) {
		case "milk":
			return new Milk();
		case "phone":
			return new Phone();
		default:
			throw new IllegalArgumentException();
		}
	}
}
