package functionalinterface.consumer;

public class MainConsumer {
	public static void main(String[] args) {
		Consumer<Integer> bird = (Integer  val) ->{
			if(val >10) {
				System.out.println("loging");
			}
		};
		
		 
	}

}
