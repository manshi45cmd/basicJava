package designPattern.Singleton;

import java.io.Serializable;

public class Samosa  implements Serializable, Cloneable {
	 
	private static Samosa samosa;
	
	//constructor
	private Samosa(){
		
		// Solution to break Singleton pattern
		
//		if(samosa != null) {
//			throw new RuntimeException("you are tring to break singleton pattern");
//		}
  	
	}
	
	//Lazy way to creating singleton object
	public static Samosa getSamosa() {
		
		if(samosa==null) {
			samosa = new Samosa();
		}
		return samosa;
	}
	
	// with thread safe 
	public static Samosa getSamosaTh() {
		if(samosa == null)
		{
			synchronized(Samosa.class) {
				if(samosa == null) {
					samosa = new Samosa();
				}
			}
		}
		return samosa;
		
	 
	}
 
  // Solution  Deserialization --> implementing read resolve method;
	public Object readResolve() {
		return samosa;
	}
	
	//  break using clone
	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

}
