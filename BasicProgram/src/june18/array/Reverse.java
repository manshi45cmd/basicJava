package june18.array;

public class Reverse {
	
	public static int[] reverse(int[] array) {
		int [] newArray = new int[array.length];
		int count = 0;
		for(int i = array.length -1;i>=0;i--) {
			newArray[count]=array[i];
		count++;
	}
	 return newArray;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] ttt = {34,23,3,53,21,6,2};
		int [] ra = reverse(ttt);
		
		//for(i=0;i<ra.length)
		for(int i = ttt.length-1;i>=0;i--) {
			System.out.print(ttt[i]+" ");
		}

	}

}
