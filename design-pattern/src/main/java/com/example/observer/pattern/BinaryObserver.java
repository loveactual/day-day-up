package com.example.observer.pattern;

public class BinaryObserver extends Observer {
	
	protected BinaryObserver(Subject subject) {
		super(subject);
		subject.attach(this);
	}

	@Override
	public void update() {
		System.out.println( "Binary String: " 
			      + Integer.toBinaryString(subject.getState()));
	}

}
