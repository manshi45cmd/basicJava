package june19.multidimenstional;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] mat = new int [3][3];
		int count = 1;
		for(int i = 0; i<mat.length;i++) {
			
			for(int j = 0;j<mat[0].length;j++) {
				
				mat[i][j]=count++;
				
				System.out.print(mat[i][j]+1+" ");
			}
			System.out.println( " ");
		}
		 
	}

}
