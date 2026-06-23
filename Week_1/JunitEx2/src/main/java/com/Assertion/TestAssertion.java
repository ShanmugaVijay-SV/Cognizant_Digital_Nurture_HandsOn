package com.Assertion;

public class TestAssertion {
	static TestAssertion obj=null;
	public static int add(int a,int b) {
		return a+b;
	}
	
	public static boolean isAdult(int a) {
		if(a>=18) return true;
		return false;
	}
	public static TestAssertion returnobj() {
		return obj;
	}
	public static TestAssertion returnobj2() {
		return new TestAssertion();
	}

	public static Object divide(int i, int j) {
		if(j==0) {
			throw new ArithmeticException("Cannot divide by 0");
		}
		return i/j;
	}
	
	
}
