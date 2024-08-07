package functionalinterface.consumer;

import java.util.function.Consumer;
import java.util.function.Supplier;

public class MainTest1 {
	
	
	public static void main(String[] args) {
		
 Consumer<String> consumer1 = new ConsumerImpl();
		
		consumer1.accept(" kkkk");
	 
		 Consumer<String> consumer2 =  ConsumerInterface :: doingSomeOperation;
		 consumer2.accept("Ram");
		 
		 
		 Supplier s = new ConsumerImpl : supplierMethod;
	}

}
