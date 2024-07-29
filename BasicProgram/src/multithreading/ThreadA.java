package multithreading;

public class ThreadA  extends Thread{
	
	@Override
	public void run() {
		for(int i =0;i<10;i++) {
			System.out.println( " inside the ThreadA "+i);
		}
		System.out.println("end of threadA");
	}
	
	 
}
