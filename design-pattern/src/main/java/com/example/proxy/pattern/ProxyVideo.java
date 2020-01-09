package com.example.proxy.pattern;

public class ProxyVideo extends RealVideo {
	
	private String adv;

	public ProxyVideo(String adv, String fileName) {
		super(fileName);
		this.adv = adv;
	}

	@Override
	public void play() {
		System.out.println("play adv：" + adv);
		super.play();
	}
	
	public static void main(String[] args) {
		ProxyVideo video = new ProxyVideo("娃哈哈广告", "变形金刚");
		video.play();
	}
	
}
