package com.example.proxy.pattern;

public class RealVideo implements Video {
	
	private String fileName;
	
//	public RealVideo() {
//		super();
//	}

	public RealVideo(String fileName) {
		super();
		this.fileName = fileName;
	}

	@Override
	public void play() {
		System.out.println("play：" + fileName);
	}

}
