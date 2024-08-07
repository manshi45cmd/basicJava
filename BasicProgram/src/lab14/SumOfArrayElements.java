package lab14;
import java.util.*;

public class SumOfArrayElements {
  
	public static void main(String[] args) {
//	  take input from user 
	Scanner sc = new Scanner(System.in);
	
	System.out.println(" size of array");
	  int n =sc.nextInt();
	 
	  int[] arr =  new int[n];
	  System.out.println(" Enter" + n + "  element ");
	  for(int i = 0;i<arr.length;i++) {
			arr[i]= sc.nextInt();
		} 
	  
//	   sum of array elements
	   int sum = 0;
	 for(int i = 0; i<arr.length;i++) {
		 
		sum = sum + arr[i];
	 } 
	  System.out.println("sum : " +sum);
	  
//	 average of array elements  
	  
	  double avg = sum/arr.length;
	    
	  System.out.println(" average : " + avg);
	}
	 
	}
 
 