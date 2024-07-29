package multithreading;

public class Testing {
	public static void main(String[] args) {
		
		ThreadAA ta = new ThreadAA();
		ThreadBB tb = new ThreadBB();
		
		Thread t1 = new Thread(ta);
		Thread t2 = new Thread(tb);
		
		t1.setName("Kumaar");
		t2.setName("Shanu");
		
		t1.start();
		t2.start();
		
	}

}
