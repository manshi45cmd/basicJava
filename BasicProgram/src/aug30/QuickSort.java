package aug30;

public class QuickSort {
	 
	public static int partition(int [] arr , int low , int high) {
		
		int pivot = arr[high];
		int i  = low-1;
		
		for(int j =low; j<high ; j++) {
			if(arr[j] < pivot) {
				i++;
				
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
			
		}
		
		int temp = arr[i];
		arr[i] = pivot;
		arr[high] = temp;
		
		
		return i;
	}
	
	
	public static void quickSort(  int[] arr , int low, int high   )
	{
		 
	 if(low < high) {
		 int indx = partition(arr , low , high);
		 
		 quickSort(arr , low, high);
	 }
	}
	
	
	public static void main(String[] args) {
		
		 
		 int [] arr = {6,3, 9, 5, 2};
		 int n = arr.length;
		
		
		
	}

}
