package multithreading.resCondition;

public class TestSyncronized {
	
	public static void main(String[] args) {
		
		//class lavel lock
		
		Common c = new Common();
		Common c1 = new Common();
		

		ThreadA t1 =  new ThreadA(c,"Ram");
		 
		 ThreadB t2 = new ThreadB(c,"Shyam");
		 
		 t1.start();
		 t2.start();
	}

}
