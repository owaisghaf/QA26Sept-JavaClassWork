package com.example.mybeans;

public class Product {
	
	String ProdName;
	int ProdPrice;
	public Product(String name, int age) {
		super();
		this.ProdName = name;
		this.ProdPrice = age;
	}
	@Override
	public String toString() {
		return "Product [Product Name=" + ProdName + ", Price=" + ProdPrice + "]";
	}

	

}
