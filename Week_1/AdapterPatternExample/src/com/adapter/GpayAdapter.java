package com.adapter;

public class GpayAdapter implements PaymentProcessor{
	Gpay gpay = new Gpay();
	@Override
	public void pay(double amt) {
		gpay.makePayment(amt);
	}

}
