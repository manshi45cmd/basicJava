package array;

public class AnonymousArray {
	
	public static void main(String[] args) {
		
		AnonymousArray.sum(new int[][] {{1,2,3},{4,5}});
		
		
	}

	public  static void sum(int[][] no) {
		int total =0;
		for(int ii[]:no) {
			for(int i:ii) {
				total = total+i;
			}
		}
		System.out.println("sum is :"+ total);
		
	}
}
