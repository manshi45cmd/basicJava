package hellow;

public class Jude     extends Thread {
  
	public void run() {

		System.out.println("Executing while loop");

		while(true){}

		}

		}
  class  TT {

		public static void main(String args[]) throws Exception {

			Jude thread1 = new Jude();

		thread1.start();

		Thread.sleep(5000);

		thread1.interrupt();

		}

}

