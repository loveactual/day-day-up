package com.example.dip;

/**
 * 例： 工厂生产牛奶和玩具，如果要多生产一种产品  则要添加一个方法，并在main方法中调用，比较繁琐
 * 
 * 将产品抽象为接口 工厂生产产品的时候只需要新增产品即可
 *
 */
public class Test {

	public static void main(String[] args) {
		Factory factory = new Factory();
		factory.makeMilk();
		factory.makeToys();
		
		IFactory iFactory = new IFactory() {};
		iFactory.product(new Milk());
	}

}
