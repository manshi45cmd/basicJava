package lambdaExpression;

public class LamdaWithThread {
	public static void main(String[] args) {
		
		Runnable thread1 = () ->{
			
			for(int i =0;i<=5;i++) {
			System.out.println("value of i " +i);
			 
			
			try {
				 Thread.sleep(1000);
			}
			 catch(InterruptedException e) {
				 System.out.println(e);
			 }
			}
		};
		
		Thread t1 = new Thread(thread1);
		t1.setName("MainThread");
		t1.start();
		
		Runnable thread2 = () ->{
			  
			try {
				for(int i =1;i<=10;i++)
				{
					System.out.println(i*2);
				}
				Thread.sleep(3000);
			}catch(InterruptedException e) {
				 System.out.println(e);
			 }

		};
		
		Thread t2 = new Thread(thread2);
		t2.start();
	}

}
