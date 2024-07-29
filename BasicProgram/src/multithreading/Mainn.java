package multithreading;


import java.util.*;
 
public class Mainn implements Runnable {
	
	public void run() {
		for(int i =0;i<6;i++) {
			System.out.println("inside run method " + i );
		}
		 
	}
	
	public static void main(String[] args) {
		
		Mainn m1 = new Mainn();
		Thread t1 = new Thread(m1);
		
		t1.start();
 
		for(int i = 0;i<=5;i++) {
			System.out.println(" inside the Mian thread " + i);
		}
	}

}
