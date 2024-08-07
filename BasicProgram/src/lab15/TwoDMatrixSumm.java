package lab15;
import java.util.*;
public class TwoDMatrixSumm {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of rows:");
		int row = sc.nextInt();
		System.out.println("Enter number of cols:");
		int col = sc.nextInt();
		// create two matrix 
		int[][] matrix = new int[row][col];
		int[][] matrix2 = new int[row][col];
		
		// get the elements of the matrices
		System.out.println("Enter the element of Matrix 1:");
		for(int i = 0; i<row; i++) {
			for(int j = 0; j< col;j++) {
				matrix[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Enter the elements of Matrix 2:");
		for(int i =0; i<row; i++) {
			for(int j =0; j<col;j++) {
				matrix2[i][j] = sc.nextInt();
			}
		}
		
		Integer[][] result = addMatrices(matrix, matrix2);
		System.out.println("sum of matrices:");
		 for (int i = 0; i < row; i++) {
	            for (int j = 0; j < col; j++) {
	                System.out.print(result[i][j] + " ");
	            }
	            System.out.println();
		 }
	}	 
		
	public static Integer[][] addMatrices(int[][] matrix, int[][] matrix2) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        Integer[][] result = new Integer[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = matrix[i][j] + matrix2[i][j];
            }
        }

        return result;
	}
}
