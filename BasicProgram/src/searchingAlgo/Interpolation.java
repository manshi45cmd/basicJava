package searchingAlgo;

public class Interpolation {
//	 time complexity  = O(log(log(n))),
	

public  static int InterpolationSearch(int[] arr, int low,int high, int k) {
 
	int pos;
	 
	while(low<= high  && k >= arr[low] && k<= arr[high])
	{
//		pos = low+ ((high-low)/(arr[high]- arr[low])*(k-arr[low]));
		
  
 pos = low + (((high - low) * (k - arr[low])) / (arr[high] - arr[low]));
 System.out.println("posss " + pos);
		
		if(arr[pos] == k) {
			return pos;
		}
		if(arr[pos]< k) {
			low = pos+1;
		}else {
			high = pos-1;
		}
	}
	
	
	return -1;
	 
}
	
	public static void main(String[] args) {
		
int[] arr = {2,4,6,8,10,16, 19,20,22,33,35, 45, 49};
		int n= arr.length;
		int k = 33;
		int utter = InterpolationSearch(arr,0,n-1,k);
		
		System.out.println(utter);
		
	 
		
		
	}
 

}
