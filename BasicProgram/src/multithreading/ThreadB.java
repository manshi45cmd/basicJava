package multithreading;

public class ThreadB extends Thread {
	@Override
	public void run() {
		for(int i =40;i<50;i++) {
			System.out.println(i+"second thread");
	
		}
		System.out.println("end of thread");
	}

}
