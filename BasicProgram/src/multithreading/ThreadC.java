package multithreading;

public class ThreadC extends Thread {
	 @Override
	 public void run() {
		 
	for(int i =20;i<30;i++) {
		System.out.println(i+" inside third threadC");
	}
	System.out.println("end of threadC");
}

}
