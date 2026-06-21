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
		Search.add(new Product("Apple",106,"Grocery"));
		Search.add(new Product("HP 15s",102,"Electronics"));
		Search.add(new Product("Asus",101,"Electronics"));
		Search.add(new Product("Vivobook",103,"Electronics"));
		Search.add(new Product("Dhall",107,"Grocery"));
		Search.add(new Product("Good Day",108,"Snack"));
		Search.add(new Product("Vivo",111,"Electronics"));
		Search.add(new Product("Godrej AC",112,"Home_Appliances"));
	}
	
	@Override
	public String toString() {
	    return "Product [ProductName=" + ProductName
	            + ", ProductId=" + ProductId
	            + ", category=" + category + "]";
	}
	
}
