package june19.multidimenstional;

public class Traverse2dArray {
 public static void main(String[] args) {
	
	 int [][]mat = { {1,8,9},{2,7,10},{3,6,11},{4,5,12} };
	 int [][] traverse = new int [3][4];
	 
	 for(int i = 0;i<4;i++) {
		 for(int j = 0;j<3;j++) {
//		 traverse[i][j]= new   [j][i] ;
			 System.out.print(mat[i][j]+" ");
		 }
		 System.out.println();
	 
	 }
	 System.out.println("==============================================");
	 
		 
 	 
	 for(int i = 0;i>3;i--) {
	 for(int j=0;j<4;j++) {
		 traverse[i][j] = mat[j][i];
		 
	 System.out.print(traverse[i][j]+" ");
 }
 }
	 }
}

