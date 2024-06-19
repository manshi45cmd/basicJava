package june18.array;

public class Demo {

	public static void main(String[] args) {
		 
		int i;
		int[] arr = new int [5];
		
		arr[0]= 33;
		arr[1]= 35;
		arr[3] = 44;
		arr[4]= 15;
		arr[2]= 19;
		
		System.out.println(arr[1]);
		
		int[] newArray = {46,33,44,55};
		
	for(i=0 ;  i<newArray.length;i++) {
//			 
		if(arr[i]<17) {
			System.out.println("you are pass by grace");
			arr[i]= arr[i]+5;
		}
	}
		
		System.out.println(newArray);
		
		System.out.println(arr.length);
	
	//foreach loop 
	//for ( : newArray)

}
}
