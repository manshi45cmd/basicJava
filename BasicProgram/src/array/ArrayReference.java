package array;
import java.util.*;
public class ArrayReference {
	
	static void printArray(int[]arr) {
		for(int i =0;i<arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
public static void main(String[] args) {
	//referance ki copy banti h oure array ki copy nhi banti h 
	//new value allocte nhi hoti h
	//shallow copy
	int[] arr = new int[5];
	arr[0]= 2;
	arr[1]= 3;
	arr[2]= 5;
	arr[3]= 6;
	arr[4]= 7;
	
	System.out.println("Original arr ");
	printArray(arr);
	
	//tring to copy arr to arr2
	//int[]arr2 = arr;
	
	//cloing Array
	//int[]arr2 = arr.clone();
	
	//uging Array copy and 
	
	//int[]arr2 = Arrays.copyOf(arr, arr.length);
	
	//copy of range
	int[]arr2  =Arrays.copyOfRange( arr,0 , arr.length);
	
	System.out.println("coppied arr2");
	printArray(arr2);
	
	//changing some value of arr2
	
	arr2[0]=0;
	arr2[1]=0;
	
	System.out.println("original array after changing arr2");
	printArray(arr); 
	
	System.out.println("coppied arr2 after chnaging arr2");
	printArray(arr2);
 
	 
}
}
