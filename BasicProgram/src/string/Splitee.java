package string;

import java.util.Arrays;

public class Splitee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "Sharam is a good player and he is so punctual";
 	
		String arr[] = s.split(" ");
		System.out.println(Arrays.toString(arr));
		
		System.out.println(arr.length);
		
		//single word ko reverse kro
		//punctual ------> to sharma
 	
		for(int i = 0;i<arr.length ;i++) {
			
			 String reverse = arr[i];
			 
			 String r = "";
			 for(int j = reverse.length()-1;j>=0;j--) {
				 r = r+reverse.charAt(j);
			 } 
			System.out.print(r+" ");
		}
		System.out.println();
		
		for(int ii= arr.length-1;ii>=0;ii--) {
			
//            	String reverse = arr[ii];
			System.out.print(arr[ii] +" ");
		}
	}
}	