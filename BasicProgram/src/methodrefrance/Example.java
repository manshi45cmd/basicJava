package methodrefrance;

public class Example {
	
//	Instance method reference 
	
	public void normalMethod(int i) {
		System.out.println("running " +i+ "KM");
		
		
	}

	public static void main(String[] args) {
		
		Example j = new Example();
		
		Summ kk =  j :: normalMethod;
		
		kk.calculation(5);
		
	}
}
