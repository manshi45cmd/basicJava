package sorting;

public class BubleSort {
	
	public static void printArray(int[] arr) {
		for(int i =0;i<arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		int[] arr =    {3,8,7,1,2};
		
//		time complexity O(n^2) big n squre
		// bubble sort
		for(int i =0; i<arr.length;i++) { // inner loop n-1
			for(int j =0; j<arr.length-i-1;j++) {
				if(arr[j]> arr[j+1]) {

					// swaping
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
				 
			}
			
		}
		
		// call method
		
		printArray(arr);
		
	}

}
