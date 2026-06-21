package com.searchfunction;

public class Product {
	
	String ProductName;
	int ProductId;
	String category;
	
	Product(){}
	Product(String name,int id,String category) {
		ProductName=name;
		ProductId=id;
		this.category=category;	
	}

	public static void fillInventory() {
		Search.add(new Product("Apple",105,"Grocery"));
		Search.add(new Product("HP 15s",102,"Electronics"));
		Search.add(new Product("Vivo",114,"Electronics"));
		Search.add(new Product("Godrej AC",156,"Home_Appliances"));
	}
	
	@Override
	public String toString() {
	    return "Product [ProductName=" + ProductName
	            + ", ProductId=" + ProductId
	            + ", category=" + category + "]";
	}
	
}
