package com.example.strategy.pattern;

public class Test {

	public static void main(String[] args) {
		Context context = new Context(new OperationAdd());
		System.out.println(context.executeStrategy(3, 5));
		
		context = new Context(new OperationSubstract());
		System.out.println(context.executeStrategy(3, 5));
	}

}
