package com.forecasting;

public class FinancialForecasting {
	
	public double calculateFF(double rate,int years,double amount) {
		
		if(years==0) 
			return amount;
		
		return calculateFF(rate,years-1,amount)*(1+rate);
	}
}
