package array;

public class Array_is_Sortted {
	
	static boolean isSortted(int[]arr) {
		boolean check = true;
		for(int i=1 ;i<arr.length;i++) {
			if(arr[i]<(arr[i]-1)) {
				check =false;
				break;
			}
		}
		return check;
	}
public static void main(String[] args) {
	
	int[] arr = {1,5,6,7,9};
	int[] arr2 = {2,4,3,5,1};
	
	System.out.println("is sortted array :"+ isSortted(arr));
	System.out.println("is sortted array2 :"+ isSortted(arr2));	
}
}
