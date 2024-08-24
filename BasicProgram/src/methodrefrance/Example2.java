package methodrefrance;

public class Example2 {
	
//	static method reference 
	
	public static void notLikeRun() {
		System.out.println(" Thread is working ....");
	}
	
	public static void main(String[] args) {
		
		Thread t1 = new Thread(Example2 :: notLikeRun);
		
		t1.start();
	}

}
