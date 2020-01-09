package com.example.prototype.pattern;

public class Cache {
	
	private Prototype prototype;

	public Cache(Prototype prototype) {
		super();
		this.prototype = prototype;
	}
	
	public Prototype clonePrototype() {
		return this.prototype.cloneType();
	}

}
