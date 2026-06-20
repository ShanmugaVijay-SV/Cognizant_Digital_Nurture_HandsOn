package com.adapter;
import java.util.*;

public class Test {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter amount to pay : ");
		double amt = sc.nextInt();
		
		sc.nextLine();
		System.out.println("Enter mode of payment : ");
		String string = sc.nextLine();
		
		choosePaymentMode ptype = new choosePaymentMode();
//		if(ptype==null) {
//			System.out.println("Give valid type");
//			return;
//		}
		PaymentProcessor pp = ptype.select(string);
		
		pp.pay(amt);
		
		sc.close();
	}

}
