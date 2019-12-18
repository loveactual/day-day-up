package com.example.ocp;

import java.math.BigDecimal;

/**
 *	已经有一个接口，定义了获取name、desc、price三个方法，Book实现了该方法，  
 * 	现在想要打折出售Book，如果直接修改Book的getPrice方法会有风险，则创建DiscountBook，重写getPrice方法来规避风险。
 */
public class Test {
	public static void main(String[] args) {
		Book book = new Book("Java编程的艺术", "编程的艺术", new BigDecimal(100));
		
		System.out.println(book.getPrice());
		
		DiscountBook discountBook = new DiscountBook("Java编程的艺术", "编程的艺术", new BigDecimal(100));
		discountBook.setDicount(new BigDecimal("0.6"));
		System.out.println(discountBook.getPrice());
		
	}
}
