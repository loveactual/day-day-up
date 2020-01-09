package com.example.adapter.pattern;

public class PhonePowerAdapter implements PowerAdapter {
	
	private Power power;
	
	public PhonePowerAdapter(Power power) {
		super();
		this.power = power;
	}

	@Override
	public int output() {
		return this.power.output()/44;
	}

}
