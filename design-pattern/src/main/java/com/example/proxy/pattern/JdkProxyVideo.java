package com.example.proxy.pattern;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class JdkProxyVideo implements InvocationHandler{
	
	private String adv;
	
	private Object target;
	
	public Object getInstance(Object target, String adv) {
		this.adv = adv;
		this.target = target;
		
		Class<?> clazz = target.getClass();
		return Proxy.newProxyInstance(clazz.getClassLoader(), clazz.getInterfaces(), this);
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		before();
		Object obj = method.invoke(this.target, args);
		return obj;
	}
	
	private void before() {
		System.out.println("play adv:" + adv);
	}
	
	public static void main(String[] args) {
		Video video = (Video) new JdkProxyVideo().getInstance(new RealVideo("变形金刚"), "娃哈哈广告");
		video.play();
	}

}
