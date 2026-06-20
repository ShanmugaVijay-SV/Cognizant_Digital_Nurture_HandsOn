package com.adapter;

public class choosePaymentMode {

	public PaymentProcessor select(String string) {
		
		if("gpay".equalsIgnoreCase(string)) {
			return new GpayAdapter();
		}
		else if("phonepay".equalsIgnoreCase(string)) {
			return new PhonepayAdapter();
		}
		
		return null;
		
	}
	
}
