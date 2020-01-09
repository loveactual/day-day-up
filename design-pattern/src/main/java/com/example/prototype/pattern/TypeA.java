package com.example.prototype.pattern;

public class TypeA implements Prototype{
	
	private int height;
	
	private String name;
	
	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}



	@Override
	public TypeA cloneType() {
		TypeA a = new TypeA();
		a.setHeight(this.height);
		a.setName(this.name);
		return a;
	}

}
