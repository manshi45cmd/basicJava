package array;
import java.util.*;

public class CountNumOfElement {
	
	static int  countOccurrences(int[] arr,int x) {
		int count = 0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i] == x) {
				count++;
			}
		}
		return count;
		
	}
	
	static int   gratter(int[] arr,int x) {
		int count = 0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i] > x) {
				count++;
			}
		}
		return count;
		
	}
	
	public static void main(String[] args) {
		
		int []arr = {2,3,4,2,3,4,6,5,7,5};
		int x =5 ;
		
		System.out.println("count of X : "+countOccurrences(arr,x));
		
		System.out.println("gratter of X : "+ gratter(arr,x));
	}

}
