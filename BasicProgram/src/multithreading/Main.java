package multithreading;

public class Main  extends Thread{
	
	
	public void run () {
		
		System.out.println("inside run method ");
	}
	public static void main(String[] args) {
		
		Main t1 = new Main();
		Main t2 = new Main();
	 
		System.out.println("t1 thread priority :" + t1.getPriority());
		System.out.println("t2 thread priority :" +t2.getPriority());
		 
		t1.setPriority(5);
		
		t1.setName("Ram");
		
		t1.start();
		
		
		
		 
	}
	

}
