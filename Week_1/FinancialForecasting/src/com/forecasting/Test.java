package com.forecasting;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the annual rate :");
		double growthrate = sc.nextDouble();
		
		System.out.println("Enter Number of years :");
		int years = sc.nextInt();
		
		System.out.println("Enter initial amount :");
		double amount = sc.nextDouble();
		
		FinancialForecasting obj = new FinancialForecasting();
		System.out.print(obj.calculateFF(growthrate/100.00,years,amount));
		
	}

}
