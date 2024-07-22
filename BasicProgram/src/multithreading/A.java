package multithreading;

public class A  implements Runnable{
	
	int sum;

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		for(int i=0;i<=10;i++) {
			System.out.println("inside A thread ");
			
			    sum = sum+i;
		}
	}
	

}

 