package com.anudeep.JUnitTesting;

public class Sevice {
	
	public static int doCalculation(int a, int b) {
		int c = a + b ;
		return c;
	}
	
	public static int productTwoNumber(int a , int b) {
		 
		return a*b;
		
	}
	
public static int  divedeTwoNumber (int a , int b) {
		
		return a/b;
}

public static int sumAnyNumber(int ...num) {
	int ans = 0;
	for(int a :num) {
		ans += a;
		
	}
	return ans;
}

}
