package com.searchfunction;
import java.util.*;

public class Test {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Product.fillInventory();
		
		int id = sc.nextInt();
		
		Product BSR=Search.BS(id);
		
		if(BSR==null)
			System.out.println("The item is unavailable!");
		
		else
			System.out.println(BSR.toString());
		
		Product LSR=Search.LS(id);

		if(LSR==null)
			System.out.println("The item is unavailable!");
		
		else
			System.out.println(LSR.toString());
		
	}

}
