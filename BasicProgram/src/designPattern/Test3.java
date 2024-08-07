package designPattern;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Test3 {
	
	public static void main(String[] args) {
		
		SingleDesignPattern obj1 = SingleDesignPattern.getInstance();
		
		ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream());
	}

}
