package lab14;
import java.util.*;
public class ArraySorting {
	
	public static void main(String[] args) {
	 
		// take inpur from user 
	Scanner sc = new Scanner(System.in); 
	System.out.println(" Enter Size of Array ");
	int n = sc.nextInt();
	int[] arr = new int[n];
	
	System.out.print("Enter " + n + " elements ");
	for(int i = 0; i<arr.length;i++) {
		  arr[i] = sc.nextInt();
	}
	
	System.out.println( " original array ");// print original array 
	for(int i =0;i< n;i++) {
		System.out.print(arr[i] + " ");
	}
	int temp= 0;
 
	//sorted algorithm for array sorting
	for(int i =0; i<arr.length;i++) { // outer loop
		for(int j = i+1;j<arr.length;j++) { // inner loop 
			if(arr[j]< arr[i]) {
				temp = arr[i];
				arr[i] = arr[j];
				arr[j]= temp;
			}
		}
	}
	System.out.println(" sorted array ");// print sorted array
	for(int i =0;i<arr.length;i++) {
		System.out.print( arr[i] + " ");
	}
	 
	}
}
