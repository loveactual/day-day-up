package com.example.decorator.pattern;

public class Test {
	public static void main(String[] args) {
		
		RedShapeDecorator decorator = new RedShapeDecorator(new Circle());
		
		decorator.draw();
		
	}
}
