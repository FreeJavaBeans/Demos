package com.revature.calculator;

public class Calculator {
	
	
	public double add (double d, double d2) {
		if(d == Double.MAX_VALUE && d2 > 0) {
			return Double.POSITIVE_INFINITY;
		}
		if(d == Double.MIN_VALUE && d2 < 0) {
			return Double.NEGATIVE_INFINITY;
		}
		if(d2 == Double.MAX_VALUE && d > 0) {
			return Double.POSITIVE_INFINITY;
		}
		if(d2 == Double.MIN_VALUE && d < 0) {
			return Double.NEGATIVE_INFINITY;
		}
		if((d == Double.POSITIVE_INFINITY && d2 == Double.NEGATIVE_INFINITY) || (d2 == Double.POSITIVE_INFINITY && d == Double.NEGATIVE_INFINITY))	{
			return 0;
		}
		
		return d + d2;
	}
	
	public double subtract (double d, double d2 ) {
		return 0;
	}
	
	public double multiply (double d, double d2 ) {
		return 0;
	}
	
	public double divide (double d, double d2 ) {
		return 0;
	}

}
