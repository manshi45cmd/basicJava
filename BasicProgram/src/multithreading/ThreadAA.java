package multithreading;

public class ThreadAA  implements Runnable {
	
	public void run() {
		for(int i =0;i<10; i++) {
			
			String t1name = Thread.currentThread().getName();
			
			System.out.println("tname "+ "is running");
			
		}
	}

}
