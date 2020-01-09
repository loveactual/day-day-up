package com.example.observer.pattern;

public class Test {

	public static void main(String[] args) {
		Subject subject = new Subject();
		
		new BinaryObserver(subject);
		new HexObserver(subject);
		new OctalObserver(subject);
		
		subject.setState(12);
		System.out.println("-------------");
		subject.setState(90);
	}

}
