package june19.multidimenstional;

public class CircularTraversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
		int [][] arr = {
				{1,2,3},
				{4,5,6},
				{7,8,9} } ;
		  
		for(int i = 0; i<3; i++) {
			 
			for(int j = 0; j<3; j++) {
				System.out.print(arr[i][j]+" ");
				 
			}
			System.out.println();
			
			
		} System.out.println("===CircularTraversal=== ");
		
		for(int i =arr.length-1; i>=0;i--) {
			System.out.print(arr[i][0]+ "  ");
		}
		for(int i = 0,j=1;j<arr.length;j++) {
			System.out.print(arr[i][j]+"  ");
		}
		for(int i=  1;i<arr.length ;i++) {
			System.out.print(arr[i][arr[0].length-1] +" ");
		}
		for(int  i=3; i>arr.length;i--) {
			System.out.print(arr[i][i]+" ");
			
			
			
		}
		 
		 
		
	}

}
