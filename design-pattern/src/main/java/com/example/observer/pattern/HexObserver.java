package com.example.observer.pattern;

public class HexObserver extends Observer {

	protected HexObserver(Subject subject) {
		super(subject);
		subject.attach(this);
	}

	@Override
	public void update() {
		System.out.println("Hex String: " 
			      + Integer.toHexString(subject.getState()).toUpperCase()); 
	}

}
