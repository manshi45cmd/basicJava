package june19.multidimenstional;

public class Transport {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 3;
		int m = 3;
		int count =1;
		int [][] mat =  new  int  [3][3];
		 
		for(int i = 0; i<n;i++) {
			for(int j =0;j< m;j++) {
				  count++;
			}
		}
		
		int[][] transpose = new int [n][m];
		
		for (int i=0;i<n;i++) {
			for(int j = 0;j<m;j++) {
				transpose[j][i] = mat[i][j];
				//[i][j] = count++;
				
			}
		}
		System.out.println("transpose of matrix ");
		for(int i = 0; i<m;i++) {
			for(int j = 0;j<n;j++) {
				System.out.print(transpose[i][j]+" ");
			}// mat[i][j] = count++;
			
		}
		System.out.println();
				

	}

}
