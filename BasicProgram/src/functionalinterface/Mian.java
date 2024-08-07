package functionalinterface;

public class Mian {
	
	public static void main(String[] args) {
		
//		
//		Drawable dd = new DrawableImpl();
//		
//		 dd.draw();
		 
		 Drawable dd1 = new Sayable();
		 
		 dd1.draw();
		 
	}

}
