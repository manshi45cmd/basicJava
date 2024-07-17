package array;

import java.util.Arrays;

public class SmallestLargest {
	
	static int[] smallestLergestElement(int[] arr) {
		Arrays.sort(arr);
		 
		int [] ans = {arr[0],arr[arr.length-1]};
		return ans;
		
	}

	public static void main(String[] args) {
		int []arr = {2,3,1,6,5,4,7,1};
		int[] ans = smallestLergestElement(arr);
		 
		System.out.println("smallest :" +ans[0]);
		System.out.println("largest :" +ans[1]);
	}
}
