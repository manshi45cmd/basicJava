package functionalinterface.consumer;

import java.util.function.Consumer;
import java.util.function.Supplier;

public class MainTest1 {
	
	
	public static void main(String[] args) {
		
 Consumer<String> consumer1 = new ConsumerImpl();
		
		consumer1.accept(" kkkk");
	 
		 Consumer<String> consumer2 =  ConsumerInterface :: doingSomeOperation;
		 consumer2.accept("Ram");
		 
		 Consumer<Integer> consumer3 = ConsumerInterface :: doingSomeOperation;
		 consumer3.accept(12);
		 
		 Supplier s = ConsumerImpl :: supplierMethod;
		 System.out.println(s.get());
		 
		 
		 Runnable thread = new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("I am from runnable interface ");
			}
			 
		 };
		 
		 Thread t1 = new Thread(thread);
		 t1.start();
		 
	}

}
