package array;

import java.util.Scanner;

public class TwoPointers {
	
	static void printArray(int [] arr) {
		for(int i =0; i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}

	static void swap(arr[i], arr[j] , int temp) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter " + n + "elements ");
		
		for(int i= 0; i<n;i++) {
			arr[i] = sc.nextInt();
			
		}
	}
}
