package com.example.singleton.pattern;

/**
 * 懒汉式单例
 *
 */
public class LazySingleton {
	
	/**
	 * Double Check volatile可以保证线程之间变量的操作可见
	 */
	private volatile static LazySingleton singleton;
	
	private LazySingleton() {}
	
	public static LazySingleton getInstance() {
		if(null == singleton) {
			synchronized (LazySingleton.class) {
				if(null == singleton) {
					singleton = new LazySingleton();
				}
			}
		}
		return singleton;
	}
	
}
