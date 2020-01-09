package com.example.observer.pattern;

public abstract class Observer {

	protected Subject subject;
	

	protected Observer(Subject subject) {
		super();
		this.subject = subject;
	}

	public abstract void update();

}
