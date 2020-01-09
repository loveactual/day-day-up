package com.example.singleton.pattern;

/**
 *  饿汉式单例
 *
 */
public class HungrySingleton {
	
	private static final HungrySingleton SINGLETON = new HungrySingleton();
	
	private HungrySingleton() {}
	
	public static HungrySingleton getInstance() {
		return SINGLETON;
	}
	
}
