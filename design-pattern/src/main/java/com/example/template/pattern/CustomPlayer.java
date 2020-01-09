package com.example.template.pattern;

public class CustomPlayer extends Player {

	@Override
	void loadAdv() {
		System.out.println("加载广告");
	}

	@Override
	void loadVideo() {
		System.out.println("加载视频");
	}

	@Override
	void loadNext() {
		System.out.println("加载下一个");
	}

}
