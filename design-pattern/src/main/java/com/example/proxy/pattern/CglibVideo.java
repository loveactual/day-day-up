package com.example.proxy.pattern;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

public class CglibVideo implements MethodInterceptor {

	private String adv;

	public Object getInstance(Class<?> clazz, String adv, String fileName) {
		this.adv = adv;
		Enhancer enhancer = new Enhancer(); 
		enhancer.setSuperclass(clazz);
		enhancer.setCallback(this); 
		return enhancer.create(new Class[] {String.class}, new Object[] {fileName});
	}

	@Override
	public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
		before(); 
		return proxy.invokeSuper(obj, args);
	}

	private void before() {
		System.out.println("play adv:" + adv);
	}
	
	public static void main(String[] args) {
		
		Video video = (Video) new CglibVideo().getInstance(RealVideo.class, "娃哈哈广告", "变形金刚");
		video.play();
	}

}
