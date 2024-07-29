package com.anudeep.JUnitTesting;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class ServiceTeast {  
     @BeforeClass
     public  static void beforeAll() {
    	 System.out.println("before all test case..");
    	 System.out.println("started test ");
     }
     
     @After
     public     void afterEach() {
    	 System.out.println("After each casee..");
     }
     
	 @Test
	public void doCalculationTest() {
		 
		 int result = Sevice.doCalculation(12,12);
		 
		 int expect_result = 24 ;
		 Assert.assertEquals (expect_result , result);
		
		 
	}
	 @Ignore
	 @Test(timeout = 2000)
	 public    void productTwoNumberTest() {
		 int act = Sevice.divedeTwoNumber(12, 12);
		 int ext = 144;
		 
		 Assert.assertEquals (ext , act);
		 
	 }
	 @AfterClass 
     public static void afterAll() {
    	 System.out.println( " after all test case");
    	 
     }
	
	 @Test 
	 public void divedeTwoNumberTest() {
		 int act = Sevice.divedeTwoNumber(12, 3);
		 int ext = 4;
	 }
	 
	 @Test
public void  sumAnyNumberTest() {
	int act = Sevice.sumAnyNumber( 1 ,2,3,4);
	int ext = 10;
}
	
}
 