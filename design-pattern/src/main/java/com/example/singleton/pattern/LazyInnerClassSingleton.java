package com.example.singleton.pattern;

import java.lang.reflect.InvocationTargetException;

/**
 * 懒汉式内部类单例
 *
 */
public class LazyInnerClassSingleton {
	
	private LazyInnerClassSingleton() {
		/**
		 * 防止通过反射创建多个实例
		 */
		if(null != InstanceHolder.SINGLETON) {
			throw new RuntimeException("can not create more instance");
		}
	}
	
	public static LazyInnerClassSingleton getInstance() {
		return InstanceHolder.SINGLETON;
	}
	
	private static class InstanceHolder {
		private static final LazyInnerClassSingleton SINGLETON = new LazyInnerClassSingleton();
	}
	
	public static void main(String[] args) throws NoSuchMethodException, SecurityException, 
			InstantiationException, IllegalAccessException, IllegalArgumentException
			, InvocationTargetException, ClassNotFoundException {
		
		
		System.out.println(LazyInnerClassSingleton.getInstance());
		
		
		LazyInnerClassSingleton.class.newInstance();
		
	}
}
