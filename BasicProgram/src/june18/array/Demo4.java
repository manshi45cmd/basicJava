package june18.array;

import java.util.Arrays;

public class Demo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
           int [] ary = {4,7,1,75,31,72 } ;
//		
//		for(int i:ary) {
//			System.out.println(i);
//		}
//		
//	int max = Integer.MAX_VALUE;
//	int min = Integer.MIN_VALUE;
           
           Arrays.sort(ary);
           System.out.println(ary);
//		
//		int max = ary[0];
//		int min = ary[0];
//	
//	for(int a:ary ) {
//		if(a>max) {
//			max = a;
//		}
//		if(a<min) {
//			min = a;
//		}
//		
//	}
//           System.out.println("min is ==> "+max);
//           System.out.println("min is ==> "+min);
System.out.println("max is ==> "+ary[ary.length-1]);
//	System.out.println("min is ==> "+min);
System.out.println("min is " +ary[0]);
		
		

	}

}