package multithreading;

public class ThreadA  extends Thread{
	
	@Override
	public void run() {
		for(int i =0;i<10;i++) {
			System.out.println(i+"first thread");
		}
		System.out.println("end of thread");
	}
	
	 
	 
}
