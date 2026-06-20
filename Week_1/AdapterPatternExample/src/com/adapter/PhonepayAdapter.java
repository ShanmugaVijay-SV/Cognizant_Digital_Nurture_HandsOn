package com.adapter;

public class PhonepayAdapter implements PaymentProcessor {
	Phonepay phonepe = new Phonepay();
	@Override
	public void pay(double amt) {
		phonepe.makePayment(amt);
	}

}
