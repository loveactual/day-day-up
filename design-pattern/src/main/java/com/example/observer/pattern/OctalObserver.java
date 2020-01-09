package com.example.observer.pattern;

public class OctalObserver extends Observer {

	protected OctalObserver(Subject subject) {
		super(subject);
		subject.attach(this);
	}

	@Override
	public void update() {
		System.out.println("Octal String: " 
			     + Integer.toOctalString(subject.getState()));
	}

}
