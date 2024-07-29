package multithreading;

public class ThreadBB implements   Runnable {
	
	public void run() {
		for( int i =1 ;i<=10; i++) {
			String tname = Thread.currentThread().getName();
			System.out.println(tname + " is running ");
		}
	}

}
