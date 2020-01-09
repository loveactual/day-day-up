package com.example.abstractfactory.pattern;

public abstract class AbstractFactory {
	
	abstract Drinks getDrinks(String name);
	
	abstract Food getFood(String name);
}
