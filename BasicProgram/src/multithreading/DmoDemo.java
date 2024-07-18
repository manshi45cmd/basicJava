package multithreading;

public class DmoDemo extends Thread{

	
	public void run() {
		for(int i =0;i<30;i++) {
			System.out.println(i+"seacond thread");
		}
	}
	
	
	   
	public static void main(String[] args) {
		 X x1= new X();
		 
//		 x1.run();//single  thread hi h 
		 
		 x1.start();
		 
		 for(int i =0;i<30;i++) {
			 System.out.println(i+"main thread");
			 
		 }
	}
}
