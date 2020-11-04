package com.revature.calculator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
//purpose of this is to test a calculator
public class CalculatorTest {
	
	
	private Calculator calc;
	
	public CalculatorTest() {
		this.calc = new Calculator();
	}

	@Test
	public void testAddTwoPositives() {
		assertEquals( 3, calc.add(1, 2));
	}
	
	@Test
	public void testAddTwoNegatives() {
		assertEquals( -7.7,calc.add(-2, -5.7));
	}
	
	@Test
	public void testAddNegativeAndPositive() {
		assertEquals( 0,calc.add(-20000, 20000));
	}
	
	@Test
	public void testAddMaximumDouble() {
		//if we use max double return infinity
		assertEquals( Double.POSITIVE_INFINITY,calc.add(Double.MAX_VALUE, 1));
	}
	
	@Test
	public void testAddMinimumDouble() {
		//if we try to use min double return - infinity
		assertEquals( Double.NEGATIVE_INFINITY, calc.add(Double.MIN_VALUE, -1));
	}
	
	@Test
	public void testAddPositiveInfinity() {
		//if infinity return infinity
		assertEquals( Double.POSITIVE_INFINITY,calc.add(Double.POSITIVE_INFINITY, 1));
	}
	
	@Test
	public void testAddNegativeInfinity() {
		//if -infinity return -infinity
		assertEquals(Double.NEGATIVE_INFINITY,calc.add(Double.NEGATIVE_INFINITY, -1));
	}
	
	@Test
	public void testAddNegativeInfinityToPositiveInfinity() {
		//if -infinity and positive infinity cancel each other out
		// in real maths this is bad, we don't care in our calc
		assertEquals( 0, calc.add(Double.NEGATIVE_INFINITY, Double.POSITIVE_INFINITY));
	}

	
	
	@Test
	public void testDivideByZero() {
		
		//first arg is the class of the expected error
		//second arg is a lambda method for the assert Throws to execute
		//lambda allows to write the implementation of a method inline
		assertThrows(ArithmeticException.class, ()->{
			calc.divide(1, 0);
		});
		
	}
	
	
	
}
