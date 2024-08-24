package functionalinterface.consumer;

import java.util.function.Consumer;

public class ConsumerImpl implements Consumer {

	@Override
	public void accept(Object t) {
		// TODO Auto-generated method stub
		
		System.out.println("i am from consumerImpl");

		System.out.println(t);
	}
	
	public static int supplierMethod() {
		return 10000;
	}
	 

}
