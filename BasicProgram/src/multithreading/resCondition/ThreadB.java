package multithreading.resCondition;

public class ThreadB  extends Thread{
	
     Common c;
	
	String name;
	public ThreadB(Common c2, String string) {
		this.c =c;
		this.name=name;
		
		 
	}
 
	public void run() {
		c.fun1(name);
	}

}
