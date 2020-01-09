package com.example.template.pattern;

public abstract class Player {
	
	abstract void loadAdv();
	
	abstract void loadVideo();
	
	abstract void loadNext();
	
	public final void play() {
		// 加载广告
		loadAdv();
		
		// 播放
		loadVideo();
		
		// 加载下一个
		loadNext();
	}
	
}
