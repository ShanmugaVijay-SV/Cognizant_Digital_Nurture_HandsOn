package com.singleton;

public class Test {

	public static void main(String[] args) {
		Logger log1 = Logger.get_instance();
		Logger log2 = Logger.get_instance();
		
		if(log1 == log2) {
			System.out.println("Same Instance");
		}
		
		else {
			System.out.println("Different Instance");
		}
		
		log1.changeStatus("Using");
		
		System.out.println(log2.getStatus());
		
	}

}
