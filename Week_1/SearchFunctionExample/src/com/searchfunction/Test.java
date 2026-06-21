package com.searchfunction;
import java.util.*;

public class Test {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Product.fillInventory();
		
		int id = sc.nextInt();
		
		Product BSR=Search.BS(id);
		
		if(BSR==null)
			System.out.println("Binary Search Result : "+"The item is unavailable!");
		
		else
			System.out.println("Binary Search Result : "+BSR.toString());
		
		Product LSR=Search.LS(id);

		if(LSR==null)
			System.out.println("Linear Search Result : "+"The item is unavailable!");
		
		else
			System.out.println("Binary Search Result : "+LSR.toString());
		
	}

}
