package functionalinterface.consumer;

public interface ConsumerInterface {
	
	
	static void doingSomeOperation(int n ) {
		int c = n + 10 ;
		System.out.println(c);
	}
	

	static void doingSomeOperation(String some ) {
		
		
		System.out.println("ConsumerInterface ");
		 String result = "welcome" + some;
		System.out.println(result );
	}
	
	
	 
}
