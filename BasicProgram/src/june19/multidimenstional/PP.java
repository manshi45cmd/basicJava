package june19.multidimenstional;

public class PP {
 public static void main(String[] args) {
	 int [][] arr =  { { 1,2,3,4},{5,6,7,8},{9,10,11,12}};
	 
	 for(int i =0;i< 3;i++) {
		 for(int j=0;j< 4;j++) {
			 System.out.print(arr[i][j] + "  ");
		 } System.out.println();
	 }
	 
	 int topRow = 0,botRow = 2, leftCol = 0,rigthCol = 3;
   
	 while() {
		 // leftCol --> top to bottom 
		 for(int i = topRow;i<=botRow;i++ ) {
			 System.out.println();
		 }
		 // bottomRow --> left to rigth
			 for(int j=leftCol;j<=rigthCol;j++)
		 // rightCol --> bottom to top
		 //top row --> right to left
		 
	 }
 }
}