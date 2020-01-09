package com.example.adapter.pattern;

public class Test {

	public static void main(String[] args) {
		PowerAdapter adapter = new PhonePowerAdapter(new Power());
		System.out.println(adapter.output());
	}

}
