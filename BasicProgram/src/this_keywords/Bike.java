package this_keywords;

public class Bike {
	
	public Bike() // default const.
	{
		this(100); // ye line niche vala construstor call kr rha h
		// this  shuld be is must first statment 
	} 
	public Bike(int speed) {
		System.out.println("speed is "+speed);
	}
	public static void main(String[] args) {
		Bike b = new Bike(444);
		
	}
	
	// contristor ko sirf cons. se hi call kr sakte h

}
