package june19.multidimenstional;

public class Traverse2dArray {
 public static void main(String[] args) {
	
	 int [][]mat = { {1,8,9},{2,7,10},{3,6,11},{4,5,12} };
	 
	 
	 for(int i = 0;i<4;i++) {
		 for(int j = 0;j<3;j++) {
		 
			 System.out.print(mat[i][j]+" ");
		 }
		 System.out.println();
	 
	 }
	 System.out.println("==============================================");
	  
	 int col = mat [0].length;//3
	 int row = mat.length; //4
	 
	 for(int i = col-1;i>=0;i--) {
	 for(int j=0;j<row;j++) {
		 
		 
	 System.out.print(mat[j][i]+" ");
     }
	 
   }
 }
}
	 


