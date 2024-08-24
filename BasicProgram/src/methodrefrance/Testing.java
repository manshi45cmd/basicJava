package methodrefrance;

public class Testing  {
	
	public static void main(String[] args) {
		Summ obj = new Summ() {// anonymous class

			@Override
			public void calculation(int s) {
				// TODO Auto-generated method stub
				
			}
			
		};
		
		Summ obj1 = s -> System.out.println(s*s);// lamda
		
		obj1.calculation(8);
		
		 
		
//		Summ obj3 = DiffrenctClass :: doingSomthing();
		
		Summ obj3 = DiffrenctClass::doingSomthing();
		
		obj3.calculation(4);
	}
 
}
