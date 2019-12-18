package com.example.dip;

public class Milk implements Product{

	@Override
	public void make() {
		System.out.println("生产牛奶");
	}
	
}
