package com.anudeep.JUnitTesting;

import org.junit.Test;

import junit.framework.Assert;

public class CalculatorTest {
	
	@Test  
	public     void testAdd() {
		
		int  sum   = Calculator.add(12, 10);
		int expect_sum = 22;
		
		Assert.assertEquals(expect_sum,  sum);
	}

}
