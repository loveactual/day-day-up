package com.example.abstractfactory.pattern;

public class FactoryProduce {
	public static AbstractFactory getFactory(String factory) {
		if("food".equals(factory)) {
			return new FoodFactory();
		}else if("drinks".equals(factory)) {
			return new DrinksFactory();
		}else {
			throw new IllegalArgumentException();
		}
	}
}
