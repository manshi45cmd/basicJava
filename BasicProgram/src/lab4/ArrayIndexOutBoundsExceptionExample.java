package lab4;

 

public class ArrayIndexOutBoundsExceptionExample {

	public static void main(String[] args) {
		 
		int[] arr = {1 ,2,3,4,5};

		try {
			System.out.println(arr[7]);
		}catch(ArrayIndexOutBoundsExceptionExample e) {
			System.out.println(e);
		}
		
		System.out.println("done...");
	}
}


