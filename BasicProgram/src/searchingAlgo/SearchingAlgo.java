package searchingAlgo;

public class SearchingAlgo {
	
	public static int search(int [] arr , int k) {
//  linear search
//		for(int kk:arr) {
//			if(kk == k) {
//				 return k;
//			}	 
//		}
		
		
		
		// binary search 
//		 mid = low+(high -low)/2
//		6th index 89
		
		int low =0;
		int high = arr.length-1;
		while(low <= high) {
			int mid = low+(high - low)/2;
			
			if(arr[mid] == k) {
				return mid;
				
			}
			if(arr[mid]< k) {
				low = mid +1;
				
			}else {
				high = mid-1;
			}
		}
		
 		return -1;
		 
	}
	
	public static void main(String[] args) {
		
		int[] arr = {2,4,6,8,10,46, 89,90,92,95,555,924};
		
		int k = 92;
		int utter = search(arr,k);
		
		System.out.println(utter);
	}

}
