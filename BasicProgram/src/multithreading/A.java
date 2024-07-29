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
	
	public static void main(String [] args) {
		
		A a1 = new A();
		Thread t1 = new Thread(a1); // passing runnable object to the constructor of thread class
		t1.start();
		try {
			t1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	

}

 