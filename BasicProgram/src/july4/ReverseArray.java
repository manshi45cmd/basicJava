package july4;

public class ReverseArray {
	
	
	public static void main(String[] args) {
		
	 
	int [] arr =  new int[10];
	for(int i = 0; i< 10;i++) {
		arr[i] = (i+1) *23;
	}
	for(int num : arr) {
	System.out.println( num + " ");
	 
	}
	} 
	
	public  static void reverseArray(int[]arr) {
		 
		int [] arry = new int[10];
		int start = 0;
		
		int end = arr.length -1;
		 
		while(start < end) {
			
			int temp = arr[end];
			
			arr[end ] = temp;
			
			start++;
			end--;
		}
		 
		
		System.out.println(  arry  +" " );
		
		
	}
    
}
