package designPattern.Singleton;

public class Jalebi {

	
	// eager or early way to creating singleton object 
	private static Jalebi jalebi = new Jalebi();
	 
	public static Jalebi getJalebi() {
	
	return jalebi ;
	}
}
