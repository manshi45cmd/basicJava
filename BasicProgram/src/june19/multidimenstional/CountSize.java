package june19.multidimenstional;

public class CountSize {
  
	public static void main(String[] args) {
		int [] arr = {0,1,0,2,1,2,0,1,2,0};
		int n = 10;
		int count = 0;
		int count1 = 1;
		int count2 = 2;
		for(int i = 1; i<10;i++) {
			System.out.print(arr[i] +" ");
			
			while(arr[i]==0) {
//				arr[i] /=10;
				++count;
			}
			
//			while(arr[i]!=1) {
//				arr[i]/=10;
//				++count;
//			}
//			while (arr[i]!=2) {
//				arr[i]/=10;
//				++count;
//			}

			}System.out.println();
		System.out.println("number of 0 digits:" +count);
//		System.out.println("number of 1 digits:" +count1);
//		System.out.println("number of 2 digits:" +count2);
		 
		}
	}

