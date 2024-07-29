package multithreading;

public class X extends Thread {
	
	// creating a new thread by extending  the Thread class
	
	 public void run() {
		 for(int i =0;i<=10;i++) {
			 System.out.println("inside run thread " +i );
		 }
		 System.out.println("End of the run method");
	 }
	 
	 public static void main(String[] args) {
		
		 X x1= new X(); 
		 x1.run(); // it will be called as normal method
		 x1.start(); // here one thred 
		 
		 for(int i = 0; i<=10;i++) {
			 System.out.println("inside main thread" +i);
		 }
		 
		 System.out.println("End  second thread will start ");
	}
	

}
