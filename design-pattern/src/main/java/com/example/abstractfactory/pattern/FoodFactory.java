package com.example.abstractfactory.pattern;

public class FoodFactory extends AbstractFactory{

	@Override
	Drinks getDrinks(String name) {
		throw new UnsupportedOperationException();
	}

	@Override
	Food getFood(String name) {
		if("noodle".equals(name)) {
			return new Noodle();
		}else if("rice".equals(name)) {
			return new Rice();
		}else {
			throw new IllegalArgumentException();
		}
	}

}
