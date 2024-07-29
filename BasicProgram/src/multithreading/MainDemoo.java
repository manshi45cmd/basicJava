package multithreading;

public class MainDemoo {
	
	public static void main(String[] args) {
		A a1 = new A();
		
		Thread t = new Thread(a1);
		t.start();
		try {
			t.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		int result = a1.sum;
		
		for(int i=0;i<10;i++) {
			
			System.out.println("inside Main thread ");
			System.out.println(result);
		}
		
	}

}