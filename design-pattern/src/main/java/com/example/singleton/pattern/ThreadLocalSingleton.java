package com.example.singleton.pattern;

/**
 * 线程单例
 *
 */
public class ThreadLocalSingleton {
	
	private static final ThreadLocal<ThreadLocalSingleton> INSTANCE_LOCAL = new ThreadLocal<ThreadLocalSingleton>() {

		@Override
		protected ThreadLocalSingleton initialValue() {
			return new ThreadLocalSingleton();
		}
		
	};
	
	private ThreadLocalSingleton() {}
	
	public static ThreadLocalSingleton getInstance() {
		return INSTANCE_LOCAL.get();
	}
	
	public static void main(String[] args) {
		
		System.out.println(Thread.currentThread().getName() + "\t" + ThreadLocalSingleton.getInstance());
		System.out.println(Thread.currentThread().getName() + "\t" + ThreadLocalSingleton.getInstance());
		System.out.println(Thread.currentThread().getName() + "\t" + ThreadLocalSingleton.getInstance());
		
		Thread t1 = new Thread() {

			@Override
			public void run() {
				System.out.println(Thread.currentThread().getName() + "\t" + ThreadLocalSingleton.getInstance());
				System.out.println(Thread.currentThread().getName() + "\t" + ThreadLocalSingleton.getInstance());
			}
			
		};
		t1.start();
		
		Thread t2 = new Thread() {

			@Override
			public void run() {
				System.out.println(Thread.currentThread().getName() + "\t" + ThreadLocalSingleton.getInstance());
				System.out.println(Thread.currentThread().getName() + "\t" + ThreadLocalSingleton.getInstance());
			}
			
		};
		t2.start();
		
		System.out.println("===============");
	}
	
}
