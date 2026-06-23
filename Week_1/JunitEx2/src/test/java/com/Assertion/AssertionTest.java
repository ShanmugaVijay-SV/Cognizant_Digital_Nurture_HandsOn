package com.Assertion;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class AssertionTest {

	@Test
	public void Test1() {
		assertEquals(10,TestAssertion.add(4, 6));
	}
	@Test
	public void Test2() {
		assertNotEquals(11,TestAssertion.add(4, 6));
	}
	@Test
	public void Test3() {
		assertTrue(TestAssertion.isAdult(21));
	}
	@Test
	public void Test4() {
		assertFalse(TestAssertion.isAdult(12));
	}
	@Test
	public void Test5() {
		assertNull(TestAssertion.returnobj());
	}
	@Test
	public void Test6() {
		assertNotNull(TestAssertion.returnobj2());
	}
	@Test
	public void Test7() {
		 assertThrows(
		            ArithmeticException.class,
		            () -> TestAssertion.divide(10, 0)
		        );
	}
}
