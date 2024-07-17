package array;

public class LastIndexFind {
	static int lastOccurrence(int[]arr , int x) {
		int lastIndex = -1;
		for(int i = 0; i<arr.length;i++) {
			 
			if(arr[i] == x) {
				 lastIndex = i;
				 
			}
		}
		return lastIndex;
	}
	
	public static void main(String[] args) {
		

		int []arr = {2,3,4,2,3,4,4 };
		int x = 4;
		
		System.out.println("Last Occurrence of X : "+lastOccurrence(arr,x));
		
	}
	

}
