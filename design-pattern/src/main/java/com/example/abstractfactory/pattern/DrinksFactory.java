package com.example.abstractfactory.pattern;

public class DrinksFactory extends AbstractFactory{

	@Override
	Drinks getDrinks(String name) {
		if("milk".equals(name)) {
			return new Milk();
		}else if("cola".equals(name)) {
			return new Cola();
		}else {
			throw new IllegalArgumentException();
		}
	}

	@Override
	Food getFood(String name) {
		throw new UnsupportedOperationException();
	}
	
	
	
}
