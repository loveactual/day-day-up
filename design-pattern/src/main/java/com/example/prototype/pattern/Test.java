package com.example.prototype.pattern;

public class Test {

	public static void main(String[] args) {
		TypeA a = new TypeA();
		a.setHeight(100);
		a.setName("ssss");
		System.out.println(a);
		
		Cache cache = new Cache(a);
		
		TypeA b = (TypeA) cache.clonePrototype();
		System.out.println(b);
	}

}
