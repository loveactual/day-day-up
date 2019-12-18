package com.example.dip;

public interface IFactory {
	
	default void product(Product product) {
		product.make();
	}
	
}
