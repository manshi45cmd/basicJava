package designPattern;

import java.io.Serializable;
import java.lang.reflect.Constructor;

public class SingleDesignPattern  implements Cloneable , Serializable{
	
	static SingleDesignPattern instance = null ;  // Static variable
	
	private SingleDesignPattern(){ // private constructor
		
	}

	
	public static SingleDesignPattern getInstance() { // static method
		if (instance == null) {
			instance = new SingleDesignPattern();
			
			return instance;
		}
		
		return instance;
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}


	public Constructor<SingleDesignPattern> getDeclaredConstructors() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
  