package functionalinterface;

public class Mian {
	
	public static void main(String[] args) {
	  
		 Sayble say = new  Drawable();
		 say.sayHello();
		 
		 
//		 creating anonymous class
		 
		 Drawable i = new Drawable() {
			 
			 public void sayHello() {
				 System.out.println("this is first anonymous class ");
			 }
			 
		 };
		 
		 i.sayHello();
		 
		 
   // using our interface with the help of lambda
		 
		 Sayble jj =()->  {
			 System.out.println(" this is first i am using labda ");
		 };
	
		 jj.sayHello();
		System.out.println(  jj.hashCode() ); 
	}
	
	

}
