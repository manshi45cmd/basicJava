package june13;


public class Counter {
	static int count = 0;
	public Counter () {
		count ++;
		System.out.println(count);
		
	}
	
	public static int getCount() {
		 return count;
	}
 public static void main(String[] args) {
	 Counter c= new Counter();
	 Counter c1= new Counter();
	 Counter c2= new Counter();
	 Counter c3= new Counter();
	 
	 System.out.println("Final count " +Counter.getCount());
	 
}
}
