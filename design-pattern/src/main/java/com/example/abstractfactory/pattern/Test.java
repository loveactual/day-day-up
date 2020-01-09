package com.example.abstractfactory.pattern;

public class Test {

	public static void main(String[] args) {
		FactoryProduce.getFactory("food").getFood("noodle").make();
		FactoryProduce.getFactory("drinks").getDrinks("cola").product();
	}

}
