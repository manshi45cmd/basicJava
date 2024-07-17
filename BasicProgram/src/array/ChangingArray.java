package array;

public class ChangingArray {
	
	static void changeArray(int[] arr) {
		for(int i= 0;i<arr.length;i++) {
			   arr[i]=0;
			
		}
		System.out.println();
	}
	
	static void changeValue(int a) {
		a=101;
		
	}
	static void printArray(int[]arr) {
		for(int i =0;i<arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		int a = 5;
		changeValue(a);
		System.out.println(a);
		
		int [] arr = new int[3];
		arr[0]= 2;
		arr[1]= 4;
		arr[2] =6;
		
		changeArray(arr);
		printArray(arr);
	}

}
